
// url variable
var url = "https://5ff490fb16cf4f0017c20501.mockapi.io/student";
// counter for show list
var load = 0;


$(document).ready(function () {
    //operate function when click
    $("button").click(function () {
        //get method for load data and status have 2 argument
        $.get(url, function loadded(data, status) {
            //if first time
            if (load == 0) {
                // create table with below columns
                $("#table").append(
                    "<table id='student' border= '2px'>" +
                    "<tr>" +
                    "<th>Firstname</th>" +
                    "<th>Lastname</th>" +
                    "<th>Nationalcode</th>" +
                    "<th>Phone</th>" +
                    "<th>Age</th>" +
                    "<th>Avatar</th>" +
                    "</tr>" +
                    "</table>"
                )
                // check element for show image even if image not in mock
                function createIndicator1(element) {
                    if (element.gender == 'female') {
                        var img = "avatar1.png";
                        return img;
                    } else if(element.gender == 'male'){
                        var img = 'avatar2.png';
                        return img;
                    }else{
                        return element.avatar
                    }
                    
                }
                //for each element set values in table
                data.forEach((element) => {
                    $("table").append(
                        "<tr>"+
                        "<td>" + element.firstname + "</td>"+
                        "<td>" + element.lastname + "</td>" +
                        "<td>" + element.nationalcode + "</td>" +
                        "<td>" + element.phone + "</td>" +
                        "<td>" + element.age + "</td>" +
                        "<td><img src="+createIndicator1(element)+"></td>" +
                        "</tr>")
                });
                //increase load variable to second time dont add this table again
                load += 1;
            }
            //log data
            console.log(data);
        })
    })
    //post method to add data to mock and show data in table when register
    $("form").submit(function (event) {
        event.preventDefault();
        //create variables from html when user submit
        var firstname1 = event.target.firstname.value;
        var lastname1 = event.target.lastname.value;
        var nationalcode1 = event.target.nationalcode.value;
        var phone1 = event.target.phone.value;
        var age1 = event.target.age.value;
        var avatar1 = event.target.avatar.value;
        var gender1 = event.target.gender.value;
        //post method send data for mock
        $.post(url, {
            firstname: firstname1,
            lastname: lastname1,
            nationalcode: nationalcode1,
            phone: phone1,
            age: age1,
            avatar : avatar1,
            gender : gender1

        }, function (data, status) {
            //log data and status
            console.log(data, status);
            // if user register before load list,call loadded method first
            if (load == 0) {
                loadded();
                load += 1;
            }
            //this method check gender
            function createIndicator2() {
                if (gender1 == 'female') {
                    var img = "avatar1.png";
                    return img;
                } else if(gender1 == 'male'){
                    var img = 'avatar2.png';
                    return img;
                }else{
                    element.avatar
                }
                
            }
            //add row to table
            $("#student").append(
                "<tr>" +
                "<td>" + firstname1 + "</td>" +
                "<td>" + lastname1 + "</td>" +
                "<td>" + nationalcode1 + "</td>" +
                "<td>" + phone1 + "</td>" +
                "<td>" + age1 + "</td>" +
                "<td><img src="+createIndicator2()+ "></td>" +
                "</tr>")
        })
    })
})