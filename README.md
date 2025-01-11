# springboot-bt.cn
在宝塔面板上建立springboot后端


基于宝塔面板9.2.0腾讯云免费版。

假设已经购买了域名github.cn。申请子域名用于这个网站，例如www.github.cn。申请后DNS解析需要等待一段时间才能生效。

在src/springboot中找到后端程序并编译打包成demo-0.0.3-SNAPSHOT.jar。在src/web中找到测试页面demo-test.html。


1. 登录宝塔面板，选择文件->新建目录。建立新目录/www/wwwroot/www.github.cn。在其中建立子目录web，java。【图】
2. 上传demo-0.0.3-SNAPSHOT.jar包到/www/wwwroot/www.github.cn/java中。
3. 上传demo-test.html到/www/wwwroot/www.github.cn/web中。
4. 选择网站->Java项目->添加java项目。【图】
5. 在jar路径中选择刚才上传的demo-0.0.2-SNAPSHOT.jar。填写项目名称www.github.cn。
6. 指定环境变量SERVER_PORT=1234。注意避免端口冲突。
7. 确定保存。【图】
8. 重新打开项目www.github.cn。
9. 域名管理。添加之前申请的子域名www.github.cn。
10. 外网访问。必须添加域名之后才可以操作。首先打开外网映射，然后点击端口1234的记录编辑。
11. 代理目录设为/api。展开更多配置，设置路由重写 /api -> /。【图】
12. 保存。重启java项目。
13. 



