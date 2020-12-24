/**
 * 
 */

var cmm = cmm || {}
cmm = (() => {
	const init = ctx => {
		$(`.move-home`).click(e => {location.href = '/'})
		$(`#sign-up`).click(e => { location.href = `${ctx}/move/uss/register`})
		$(`#sign-in`).click(e => { location.href = `${ctx}/move/uss/login`})
		$(`#manager_register`).click(e => { location.href = `${ctx}/admin/mgr/register`})
		$(`#teacher_register`).click(e => { location.href = `${ctx}/admin/tea/register`})
		$(`#linkedin`).click(e => {
			location.href = `${ctx}/home`
		})
	}
	return {init}
})()