背景：
	1.传统web开发中，我们搭建项目都以html结构为基础，然后通过jquery或者js来添加各种特效功能。
	需要去选中每一个元素进行命令，这些内容在简单的项目中或者不变的项目中还能应付得来，一旦项目改动或者项目工程较大，代码的修改将是复杂繁琐的。
	2.在比如一些单网页制作成的应用程序，一般涉及到数据交互的代码内容都很多。
	Vue.js框架能解决以上问题,大大缩减工作量。
	Vue.js是基于es6（js新版），编写的。
Vue.js是什么：
	官网介绍：
		https://cn.vuejs.org/v2/guide/index.html
	优秀:
		http://baijiahao.baidu.com/s?id=1600723644487613509&wfr=spider&for=pc
	Vue是一套web界面的渐进式框架。
	Vue.js 拥抱数据驱动的视图概念。通俗地讲，它意味着我们在普通 HTML 模板中使用特殊的语法将 DOM“绑定”到底层数据。一旦创建了绑定，DOM 将与数据保持同步。 
Vue.js的使用：
	1.直接下载vue.JS,并用 <script> 标签引入，Vue 会被注册为一个全局变量。
	2.NPM 安装vue
		注：
			通常用npm安装vue脚手架，然后创建vue项目，就可以以vue开发项目了。
			脚手架是为了便于快速创建一个基于vue的项目。
	1,2区别：
		使用nodejs主要是为了便于引入第三发包,如打包工具webpack。
		Vue只聚焦于视图层，当与相关工具和支持库一起使用时，Vue.js才能完美地驱动复杂的单页应用（便于开发中大型项目）。
	https://blog.csdn.net/wenshu12321/article/details/62071611#commentBox
	？
		npm中安装vue框架，作用了
注：
	常用的npm命令：
		查询可用的包的版本号
			npm view vue-cli versions --json
		卸载
			npm uninstall -g vue-cli
		安装指定版本
			npm install -g vue-cli@2.x.x  
		vue-cli版本
			vue-cli 3.0 级以上版本 Vue CLI 的包名称由 vue-cli 改成了 @vue/cli
	webpack：
		前景：
			当前端页面复杂后，模块化开发应然而生。
			前端性能优化向来看重减少请求数量，开发时是分开的，发布前用打包器合到一起，这样页面的js请求数可以降到1。
			由此打包器应然而生，webpack就是一个打包器。
		介绍：
			1.webpack能把模块化的代码进行编译打包，运行在ie等浏览器上。
			2.webpack还能把其它一些浏览器不能直接运行的拓展语言（Scss，TypeScript等），将其打包为合适的格式供浏览器使用。
		webpack的import和require区别：
			require是commonjs规范
			import是es6规范
			目前主流浏览器都不支持import等模块化开发，固用webpack来进行打包。
		
		https://www.cnblogs.com/-walker/p/6056529.html
		http://refined-x.com/2017/06/16/Webpack%E6%98%AF%E7%AD%94%E6%A1%88%E5%90%97/
	Element
		element-ui是基于vue的组件框架。
		hcg：
			ele框架就是帮你写好了一堆vue组件，你拿来用就好了。
		vue-cli-plugin-element：
			介绍：
				https://github.com/ElementUI/vue-cli-plugin-element
				通过脚手架快速的为项目加载ele框架
	babel:
		babel是一种javascript编译器,能把最新版的javascript编译成当下可以执行的版本。
友情链接：
	vue：https://cn.vuejs.org/v2/guide/installation.html
	VueCli中文网：https://cli.vuejs.org/zh/
	es6：http://es6.ruanyifeng.com/#README
	element-ui:https://element.eleme.cn/#/zh-CN/component/table
	webpack中文网：https://www.webpackjs.com/concepts/