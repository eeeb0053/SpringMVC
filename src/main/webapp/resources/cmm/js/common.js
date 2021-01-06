'use strict'
var common = common || {}
common = (()=>{
	const init = ctx => {
		localStorage.setItem('ctx', ctx)
		// $('#manager').click(e => {location.href = `${ctx}/admin/mgr/register`})
		// $('#teacher').click(e => {location.href = `${ctx}/admin/tea/register`})
		$(`#linkedin`).click(e => {location.href = `${ctx}/`})
		$(`#stu-join`).click(e => {location.href = `${ctx}/user/register`})
		$(`#stu-login`).click(e => {location.href = `${ctx}/user/login`})
		$(`#blog_default`).click(e => {location.href = `${ctx}/content/bbs/index`})
		$(`#icon1`).html(`<img src="https://pbs.twimg.com/profile_images/1121037619876392961/_7wlT1KE_400x400.jpg" alt="">`)
		$(`#icon2`).html(`<img src="https://cdnweb01.wikitree.co.kr/webdata/editor/202005/27/img_20200527214140_0bc6d88a.webp" alt="">`)
		$(`#icon3`).html(`<img src="https://img.hankyung.com/photo/202011/BF.24513635.1.jpg" alt="">`)
		$(`#title`).text(`원어민 어학 사이트`)
		$(`#message`).text(`화상강의솔루션, 스카이프 등을 이용하여 필리핀등 원어민 강사와 \n
							한국 학생간에 회화 교육을 하는 사이트 구축.`)
		$(`#bbs`).html(`<a href="#">게시판<i class="fa fa-angle-down"></i></a>
						<ul id="bbs-ul" role="menu" class="sub-menu"></ul>`)
		let bbs_arr = [{id:'write', val: '글쓰기'}, {id:'search', val: '조회'},{id:'c', val: 'c'},{id:'d', val: 'd'},{id:'e', val: 'c'}]
		$.each(bbs_arr, (i, j) => {
			$(`<li/>`)
			.attr({id: `${j.id}`})
			.text(`${j.val}`)
			.appendTo(`#bbs-ul`)
			.click(e => {
				alert(`${j.id}`)
			})
		})
		$(`#manager`).html(`<a href="#">관리자<i class="fa fa-angle-down"></i></a>
						<ul id="mgr-ul" role="menu" class="sub-menu"></ul>`)
		let mgr_arr = [{id:'sign-up', val: '관리자 등록', url: `${ctx}/admin/mgr/register`},
					   {id:'sign-in', val: '관리자 접속', url: `${ctx}/admin/mgr/access`},
					   {id:'c', val: 'c'},
		               {id:'d', val: 'd'},
		               {id:'e', val: 'c'}]
		$.each(mgr_arr, (i, j) => {
			$(`<li/>`)
			.attr({id: `${j.id}`})
			.text(`${j.val}`)
			.appendTo(`#mgr-ul`)
			.click(e => {
				location.href = j.url
			})
		})
		$(`#teacher`).html(`<a href="#">교강사<i class="fa fa-angle-down"></i></a>
						<ul id="tea-ul" role="menu" class="sub-menu"></ul>`)
		let tea_arr = [{id:'sign-up', val: '교강사 등록', url: `${ctx}/admin/tea/register`},
		               {id:'sign-in', val: '교강자 접속', url: `${ctx}/admin/tea/access`},
                       {id:'c', val: 'c'},{id:'d', val: 'd'},{id:'e', val: 'c'}]
		$.each(tea_arr, (i, j) => {
			$(`<li/>`)
			.attr({id: `${j.id}`})
			.text(`${j.val}`)
			.appendTo(`#tea-ul`)
			.click(e => {
				location.href = j.url
			})
		})
	}
	const goHome = () => {
		$(`#goHome`).click(e => {location.href = ` ${localStorage.getItem('ctx')}/`})
	}
	return {init, goHome}
})()
