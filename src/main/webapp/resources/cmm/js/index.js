'use strict'
var cmm = cmm || {}
cmm = (() => {
	const init = ctx => {
		localStorage.setItem('ctx', ctx)
		$(`#manager_register`).click(e => { location.href = `${ctx}/admin/mgr/register`})
		$(`#teacher_register`).click(e => { location.href = `${ctx}/admin/tea/register`})
		$(`#linkedin`).click(e => { location.href = `${ctx}/`})
		$(`#board-btn`).click(e => { location.href = `${ctx}/content/bbs/index`})
		$(`#stu-join`).click(e => { location.href = `${ctx}/user/register`})
		$(`#stu-login`).click(e => { location.href = `${ctx}/user/login`})
		$('.move-home').click(e=> { location.href = `${ctx}/`})
	}
	const goHome = () => {
		$(`#goHome`).click(e=> { location.href = `${localStorage.getItem('ctx')}/`})
	}
	return {init, goHome}
})()
var wow = wow || {}
wow = (() => {
	const init = () => {
		$('#icon1').html(`<img src="https://pbs.twimg.com/profile_images/1121037619876392961/_7wlT1KE_400x400.jpg" alt="">`)
		$('#icon2').html(`<img src="https://static.hubzum.zumst.com/hubzum/2020/06/17/14/c53b5be4c08a4b8badecebb339b992c9_780x975.jpg" alt="">`)
		$('#icon3').html(`<img src="http://lavinephotography.com.au/wp-content/uploads/2017/01/PROFILE-Photography-100-e1485815865665.jpg" alt="">`)
	}
	return {init}
})()
var mainSlider = mainSlider || {}
mainSlider = (() => {
	const init = () => {
		$(`#title`).text(`원어민 어학 사이트`)
		$(`#message`).text(`회화`)
	}
	return {init}
})()