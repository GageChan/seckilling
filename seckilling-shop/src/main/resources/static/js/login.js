var vm = new Vue({
    el: '#app',
    data: {
        username: '',
        password: '',
        loading: false
    },
    methods: {
        login() {
            vm.loading = true;
            var salt = '3a4c8l';
            var pass = md5(""+salt.charAt(3) + salt.charAt(2) + vm.password + salt.charAt(0)+salt.charAt(1));
            axios.post('/login.do',{
                username: vm.username,
                password: pass
            }).then(function (value) {
                vm.loading = false;
                if (value.data.code === 0){
                    vm.$Message.success("登录成功");
                    setTimeout("window.location.href='http://baidu.com'",1000);
                }else{
                    vm.$Message.error(value.data.msg);
                }
            }).catch(function (reason) {

            });
        }
    }
});