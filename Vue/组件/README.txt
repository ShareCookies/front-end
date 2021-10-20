组件：
	组件是可复用的 Vue 实例，且带有一个名字。
	我们可以在vue实例中，把组件作为自定义元素来使用。
	例：
		在一个通过 new Vue 创建的 Vue 根实例中，把组件( <button-counter>)作为自定义元素来使用。
		<div id="components-demo">
		  <button-counter></button-counter>
		</div>
		new Vue({ el: '#components-demo' })
	
	？
		 Vue 实例
自定义插件：
	...
	插件通常会为 Vue 添加全局功能，一般是添加全局方法/全局指令/过滤器等