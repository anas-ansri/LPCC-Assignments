id = 0

str1 = input("Enter your arithmatic expression: ")

str_list = str1.split(" ")

while(len(str_list) > 3):
    if ("^" in str_list):
        idx = str_list.index("^")
        temp = ("T" + str(id) + " = " + str_list[idx - 1] + str_list[idx] + str_list[idx + 1])
        print(temp)

        for i in range(3):
            del str_list[idx - 1]

        str_list.insert(idx - 1, "T" + str(id))
        id += 1

    elif ("*" in str_list):
        idx = str_list.index("*")
        temp = ("T" + str(id)  + " = "+ str_list[idx - 1] + str_list[idx] + str_list[idx + 1])
        print(temp)

        for i in range(3):
            del str_list[idx - 1]

        str_list.insert(idx - 1, "T" + str(id))
        id += 1
    elif ("/" in str_list):
        idx = str_list.index("/")
        temp = ("T" + str(id)  + " = "+ str_list[idx - 1] + str_list[idx] + str_list[idx + 1])
        print(temp)

        for i in range(3):
            del str_list[idx - 1]

        str_list.insert(idx - 1, "T" + str(id))
        id += 1
        
    elif ("+" in str_list):
        idx = str_list.index("+")
        temp = ("T" + str(id)  + " = "+ str_list[idx - 1] + str_list[idx] + str_list[idx + 1])
        print(temp)

        for i in range(3):
            del str_list[idx - 1]

        str_list.insert(idx - 1, "T" + str(id))
        id += 1
    elif ("-" in str_list):
        idx = str_list.index("-")
        temp = ("T" + str(id) + " = "+ str_list[idx - 1] + str_list[idx] + str_list[idx + 1])
        print(temp)

        for i in range(3):
            del str_list[idx - 1]

        str_list.insert(idx - 1, "T" + str(id))
        id += 1

temp1 = ""
for i in str_list:
    temp1 = temp1 + " " + str(i)

res = []

res.append(temp1)

for i in res:
    print(i)

    
