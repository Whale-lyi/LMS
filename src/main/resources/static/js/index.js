function page(pageNo) {
    window.location.href="index?pageNo=" + pageNo;
}

function borrow(bookId) {
    alert("借阅成功！")
    window.location.href="borrow?bookId=" + bookId;
}

function edit(bookId) {
    window.location.href="edit?bookId=" + bookId;
}