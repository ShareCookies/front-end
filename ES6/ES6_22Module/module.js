var Module={
	name : "module"
}
// 写法一
export var a = 1;

// 写法二
var b = 1;
export {b};

// 写法三
var c = 1;
export {c as d};