# -*- coding: utf-8 -*-
"""LAB1.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1Jw-dGScx89r0eARdaoSfONAmacubOTEc
"""

import numpy as np
#ex1
list=[1,2,3,4]
#tuple
tu=tuple(list)
print(tu)
#set
se=set(list)
print(se)
#dictionary
di =dict()
for i,v in enumerate(list):
  di[i]=v
print(di)

import numpy as np
#ex2
di ={1:"Bui",3: "Khac",5: "Hai",7:"Bang"}
list=[]
for k in di.keys():
  list.append(di[k])
print(list)

import numpy as np
#ex3
di ={1:"Bui",2: "Khac",3: "Hai",4:"Bang",5:"Bui"}
list=[]
x = "Bui"
for k in di.keys():
  list.append(di[k])
print("a)",list.count(x))
di.update({1:"Bang",2:"Dep trai"})
print("b)",di)
di.pop(5)
print("c)",di)
di.update({6: "mom"})
print("d)",di)

import numpy as np
#ex4
s1 = {1,3,4}
s2 = {5,4,6}
print("a)",s1&s2)
print("b)",s1|s2)
x = 3
s2.add(x)
print("c)",s2)
s1.remove(x)
print("d)",s1)

import matplotlib.pyplot as plt
#ex5
list=[1,4,6,8,22,11,10,3,6]
x=[str(i) for i in np.arange(len(list))]
plt.bar(np.arange(len(list)),list,color='b')
plt.xticks(np.arange(len(list)),x)
plt.show()

import numpy as np
#ex6
print("Moi ban nhap don vi ma ban muon chuyen sang met:")
distance=input()
if(distance=="km" or distance=="kilometers"):
  print("so lieu:")
  km=float(input())
  m=float(km*1000)
  print("km into meters:",m)
elif(distance=="m" or distance=="meters"):
  print("so lieu:")
  m=float(input())
  met=float(m*1)
  print("m into meters:",met)
elif(distance=="cm" or distance=="centimeters"):
  print("so lieu:")
  cm=float(input())
  m=float(cm/100)
  print("cm into meters:",m)
else:
  print("so lieu:")
  mm=float(input())
  m=float(mm/1000)
  print("mm into meters:",m)

import numpy as np
#ex7
print("Moi ban nhap ngay sinh:")
day=int(input())
print("Moi ban nhap thang sinh:")
month=int(input())
if(day>=21 and day<= 31 and month==3):
  print("coresponding constellation: Aries(Ram)")
elif(day>=1 and day<= 19 and month==4):
  print("coresponding constellation: Aries(Ram)")
elif(day>=20 and day<= 30 and month==4):
  print("coresponding constellation: Taurus(Bull)")
elif(day>=1 and day<= 20 and month==5):
  print("coresponding constellation: Taurus(Bull)")
elif(day>=21 and day<= 31 and month==5):
  print("coresponding constellation: Gemini(Twins)")
elif(day>=1 and day<=21 and month==6):
  print("coresponding constellation: Gemini(Twins)")
elif(day>=22 and day<= 30 and month==6):
  print("coresponding constellation: Cancer(Crab)")
elif(day>=1 and day<= 22 and month==7):
  print("coresponding constellation: Cancer(Crab)")
elif(day>=23 and day<= 31 and month==7):
  print("coresponding constellation:Leo (Lion) ")
elif(day>=1 and day<= 22 and month==8):
  print("coresponding constellation:Leo (Lion) ")
elif(day>=23 and day<= 31 and month==8):
  print("coresponding constellation:Virgo (Virgin) ")
elif(day>=1 and day<= 22 and month==9):
  print("coresponding constellation:Virgo (Virgin) ")
elif(day>=23 and day<= 30 and month==9):
  print("coresponding constellation:Libra (Balance)")
elif(day>=1 and day<= 23 and month==10):
  print("coresponding constellation:Libra (Balance)")
elif(day>=24 and day<= 31 and month==10):
  print("coresponding constellation:Scorpius (Scorpion)")
elif(day>=1 and day<= 21 and month==11):
  print("coresponding constellation:Scorpius (Scorpion)")
elif(day>=22 and day<= 30 and month==11):
  print("coresponding constellation:Sagittarius (Archer)")
elif(day>=1 and day<= 21 and month==12):
  print("coresponding constellation:Sagittarius (Archer)")
elif(day>=22 and day<= 31 and month==12):
  print("coresponding constellation:Capricornus (Goat)")
elif(day>=1 and day<= 19 and month==1):
  print("coresponding constellation:Capricornus (Goat)")
elif(day>=20 and day<= 31 and month==1):
  print("coresponding constellation:Aquarius (Water Bearer)")
elif(day>=1 and day<= 18 and month==2):
  print("coresponding constellation:Aquarius (Water Bearer)")
elif(day>=19 and day<= 29 and month==2):
  print("coresponding constellation:Pisces (Fish)")
elif(day>=1 and day<= 20 and month==3):
  print("coresponding constellation:Pisces (Fish)")
else:
  print("ngay sinh khong ton tai")

import numpy as np
#ex8
#a
print("Moi ban nhap ngay sinh:")
day=int(input())
print("Moi ban nhap thang sinh:")
month=int(input())
print("Moi ban nhap nam hien tai:")
year=int(input())
tong = day//10 + day%10 + month//10 + month%10 + year//1000 +(year%1000)//100+ ((year%1000)%100)//10+((year%1000)%100)%10
so=tong//10 + tong%10
if(day >=1 and day<=31 and month>=1 and month <=12):
  print("life path number cua ban la so {}".format(so))
  if(so==2 ):
    print("Số 2 liên quan đến sự nhạy cảm, cân bằng và hài hòa. Trong Thần Số Học, tần số rung chuyển của số 2 đảm nhận vai trò của người hòa giải, tạo ra sự hòa hợp bằng cách hàn gắn các sự bất hòa thông qua lòng trắc ẩn, sự đồng cảm và lòng tốt. Số 2 có liên quan đến khả năng tâm linh và trực giác. Nếu có con số này, bạn rất nhạy bén với sự thay đổi của năng lượng và cảm xúc. Người có số 2 là Số Sinh Mệnh rất nhạy cảm và không thích xung đột. Họ có thể cảm thấy bị đánh giá thấp hoặc không được công nhận. người mang số Sinh Mệnh 2 phải tránh tìm kiếm sự công nhận từ bên ngoài và nhận ra rằng trạng thái cân bằng hoàn hảo họ cần luôn tồn tại bên trong.")
  elif(so==3 ):
    print("Giao tiếp là yếu tố quan trọng nhất đối với người có Số Sinh Mệnh là 3. Số 3 đại diện cho sự kết hợp của hai lực lượng, nói cách khác, Nó là biểu tượng của sự sáng tạo. người mang số 3 có năng khiếu diễn đạt, chia sẻ, tiên phong và sáng tạo thông qua nghệ thuật, viết lách hay diễn thuyết. Các giá trị bạn tạo ra đem lại cảm hứng, động lực và niềm vui cho người khác. Người có số 3 thích làm người khác mỉm cười. Tuy nhiên, người có số 3 khá thất thường, và bạn dễ thu mình lại hoàn toàn nếu cảm thấy bị hiểu lầm. Xu hướng hay trốn tránh của bạn sẽ giảm đi nếu bạn tĩnh tâm lại và tận hưởng khoảnh khắc hiện tại. Dù có trí tưởng tượng phong phú, điều quan trọng đối với người có số 3 là tìm những khoảnh khắc yên tĩnh để thiết lập lại, phục hồi và nạp năng lượng.")
  elif(so==4 ):
    print("Trong Thần Số Học, số 4 mang nguồn năng lượng của nguyên tố đất và tập trung vào việc củng cố gốc rễ. Người mang số 4 tin tưởng vào thế giới vật chất. Họ biết rằng để xây dựng một di sản lâu dài, ta phải đặt những nền móng thật vững chãi. Thực tế, chăm chỉ và có trách nhiệm, sự dao động của số 4 tạo ra các hệ thống logic giúp phát triển mọi khía cạnh của cuộc sống một cách bền vững. Tuy nhiên, điều  này cũng  dễ khiến họ trở nên  cứng nhắc. Số 4 phải nhớ rằng các quy tắc được sinh ra để giúp ta phát triển  chứ không phải để kìm nén nó. Người mang số 4 rất dễ trở nên cứng đầu, vì vậy họ phải học cách thả lỏng và suy nghĩ sáng tạo hơn. Người có số 4 sẽ cảm thấy được thoải mái và hứng khởi họ có đủ bản lĩnh để chấp nhận rủi ro.")
  elif(so==5 ):
    print("Tư duy sáng tạo, mạo hiểm và cầu tiến, những người đại diện của con số 5 luôn yêu thích tự do. người mang số 5 cần trải nghiệm thế giới bằng cả 5 giác quan: Số 5 học hỏi thông qua những hành động  ngẫu hứng và dũng cảm trên đường đời. Tương tự như năng lượng của Nhân Mã trong chiêm tinh học, người có số 5 được biết đến với tinh thần vui tươi, bốc đồng và hoạt bát. Nhưng năng lượng yêu đời tươi vui này cũng có mặt tối. người mang số 5 dễ trở nên bồn chồn và thiếu kiên nhẫn. Vì số 5 luôn tìm kiếm những chân trời mới để khám phá, nên họ cảm thấy khó khăn khi phải đảm nhiệm những trách nhiệm hàng ngày trong cuộc sống - bao gồm cả công việc  và các mối quan hệ cá nhân. Người mang số 5 phải nhớ rằng những khám phá bổ ích nhất đôi khi ở ngay xung quanh họ.")
  elif(so==6 ):
    print("Người có số 6 có khả năng nuôi dưỡng, hỗ trợ và đồng cảm. Những người mang số 6 có khả năng giải quyết vấn đề trong cả lĩnh vực tình cảm và thể chất, giúp đỡ người khác thông qua cách tiếp cận thẳng thắn nhưng nhẹ nhàng. 6 có tinh thần trách nhiệm cao và quan tâm sâu sắc đến bạn bè, gia đình và người yêu của mình. Những người này giỏi giao tiếp với trẻ em và động vật thông qua năng lượng dịu dàng và chở che. Nhưng không phải cái gì cũng cần được chăm nom, vì vậy đôi khi năng lượng bảo vệ của số 6 có thể trở nên độc đoán và thích kiểm soát. Để tránh gánh cả thế giới trên vai, người mang số 6 phải học cách xây dựng niềm tin và sự cảm thông: Nói một cách đơn giản: Ai cũng phải tự bước đi trên con đường đời của mình")
  elif(so==7 ):
    print("Những người mang số 7 có khả năng điều tra và kỹ năng phân tích như những thám tử thực thụ. Về mặt chiêm tinh, số 7 có thể được coi là sự pha trộn giữa năng lượng của cung Xử Nữ và Bọ Cạp: người mang số 7 để tâm tới từng chi tiết nhỏ, nhưng họ thường suy đoán dựa theo sự thông thái của bản thân hơn là thực tế hữu hình. Người mang số 7 có một con mắt tinh tường, và những quan sát sắc sảo của họ đã xây dựng nên một tinh thần sáng tạo và nhanh trí. Bởi vì họ có thể nhanh chóng tìm ra những sai sót trong mọi tình huống, số 7 là một người hơi cầu toàn. Số 7 thường bắt  lỗi người khác, vì vậy điều quan trọng đối với con số này là phải bớt đi tính đa nghi của mình và trở nên cởi mở hơn. Không có gì là tuyệt đối - nhưng đó chính là gia vị khiến cuộc sống trở nên thú vị hơn.")
  elif(so==8 ):
    print("Số 8 biểu tượng cho tiền tài và sự dư dả. Trong Thần Số Học, con số này liên quan đến của cải vật chất và thành công về tài chính. Tham vọng và luôn có mục tiêu, người mang số 8 có thể dễ dàng đảm nhận các vị trí lãnh đạo. Số 8 có khả năng nhìn xa trông rộng và có thể đạt được đỉnh cao của danh vọng. Nhưng đổi lại, những  người mang số 8 bị nghiện công việc, trong trường hợp tệ nhất, họ có thể trở thành người thích kiểm soát và chiếm hữu. Những phẩm chất tiêu cực này có thể được giảm bớt khi họ học được cách cho đi . Khi đã biết sử dụng thành công để giúp đỡ người khác, người mang số 8 sẽ nhận ra những giá trị thực sự trong cuộc sống")
  elif(so==9 ):
    print("Là số có 1 chữ số cuối cùng trong Thần Số Học, 9 là một linh hồn già cỗi. Người mang số 9 không còn lạ lẫm gì với những thăng trầm của cuộc đời - họ đã nếm trải mọi đắng cay ngọt bùi. Người mang số 9 có thể dễ dàng sử dụng năng lượng tâm linh  kết nối mọi thứ. Nhiệm vụ của người mang số 9 là đạt được tầng nhận thức cao nhất và giúp những người khác phát triển được như họ. Người mang số 9 không ngại biến đổi, đồng thời sử dụng tinh thần linh hoạt của họ để truyền cảm hứng cho những người khác, để họ khám phá bản thân. Vì số 9 đã vượt qua bình diện vật chất (theo nhiều cách khác nhau), họ phải liên tục ghi nhớ lại bản chất của chính mình để có thể trụ vững. Người mang số 9 phải học cách cân bằng giữa cái trừu tượng và cái hữu hình và tìm được vị trí của bản thân giữa tưởng tượng và thực tế.")
  elif(so==10):
    print("Những người gắn liền với đường sinh mệnh số 10 là những người độc lập, suy nghĩ rõ ràng và giàu lòng nhân ái. Những người này không muốn sống và phụ thuộc vào người khác.")
  elif(so==11 ):
    print("Số 11 là nguồn năng lượng cao hơn của Số 2; mục đích sống của họ là để quan tâm chăm sóc  cho bản thân và những người khác thông qua khả năng tâm linh được nâng cao. Trực giác sắc bén của người mang số 11 đến từ hoàn cảnh sống khắc nghiệt: Họ không có lựa chọn nào khác ngoài việc trau dồi tài năng ngoại cảm. Trong Thần Số Học, Số 11 được kết nối với sự giác ngộ tâm linh, nhận thức và cân bằng triết học.")
  else:
    print("so khong ton tai")
else:
  print("ngay sinh khong ton tai")

import numpy as np
#ex8
#b
print("Moi ban nhap ngay sinh:")
day=int(input())
print("Moi ban nhap thang sinh:")
month=int(input())
print("Moi ban nhap nam hien tai:")
year=int(input())
tong = day//10 + day%10 + month//10 + month%10 + year//1000 +(year%1000)//100+ ((year%1000)%100)//10+((year%1000)%100)%10
so=tong//10 + tong%10
if(day >=1 and day<=31 and month>=1 and month <=12):
  print("personal year number cua ban la so {}".format(so))
  if(so==1 ):
    print("Năm có số 1 là năm khởi đầu của một kế hoạch lớn, bạn hãy suy nghĩ về việc làm gì đó mới mẻ hoặc là phát triển công việc hiện tại nhé.")
  elif(so==2 ):
    print("Năm có số 2 là năm bạn cần lắng nghe và học hỏi, để có một sự phát triển chắc chắn, với kế hoạch đã lập, năm nay bạn cần nâng khả năng bản thân để sẵn sàng với các thử thách, hoặc nếu kế hoạch đang triển khai, đây là năm bạn chạy thử và đúc rút kinh nghiệm đó.")
  elif(so==3 ):
    print("Năm có số 3 là năm bạn cần là hình ảnh và truyền thông về kế hoạch của mình, hãy làm cho nó lan tỏa thật mạnh mẽ trong giai đoạn này nhé. Đây cũng là năm bạn nên mở rộng kết nối với xã hội và cộng đồng nhiều hơn.")
  elif(so==4 ):
    print("Năm số 4 là năm bạn tập trung cao độ vào công việc, hãy thực hiện kế hoạch cực kì tập trung, hoặc với bản thân, đây là khoảng thời gian tuyệt vời để chứng tỏ mình với mọi người xung quanh đấy.")
  elif(so==5 ):
    print("Năm của sự thay đổi và thư giãn một chút, cũng là năm bạn nên cải tiến mọi thứ từ công việc, dự án đang chạy hay bản thân mình để đạt hiệu suất tối đa, cũng như cần có khoảng thời gian thả lỏng đôi chút, chuẩn bị cho sự cán đích ngoạn mục nhất của mình.")
  elif(so==6 ):
    print("Năm của sự nhìn thật thật sâu sắc từ công việc, tình cảm cho đến bản thân mình, hãy phân tích mọi thứ thật chi tiết nhé, bạn cần vẽ được bức tranh cực kì chi tiết về sống động về cuộc sống của mình - những điều bạn đạt được, những điều đánh mất hoặc bỏ lỡ trong những năm đã qua...")
  elif(so==7 ):
    print("Năm số 7 với thông điệp bạn cần nghỉ ngơi, chuyển giao bớt công việc sang những người khác hoặc là truyền đạt lại những thành tựu với cấp dưới, đồng nghiệp hoặc lớp kế cận của mình. Hãy giảm bớt gánh nặng để chuẩn bị cho chu kì mới nhé.")
  elif(so==8 ):
    print("Rung động này nhắn nhủ rằng bạn cần tổ chức, sắp xếp và thu nhặt những thành quả của mình lại, nếu suốt những năm vừa rồi bạn đã trồng cây, chăm bón thì giờ là lúc thu hoạch rồi đấy, dù là được bao nhiêu, hãy vui vẻ để chuẩn bị nguồn lực cho vụ tới nhé ")
  elif(so==9):
    print("Hãy loại bỏ những điều không quan trọng và kết thúc chu kì ở đây, đồng thời nhìn nhận lại cả quá trình với một tâm thái thật bình an, tự thưởng cho mình một điều gì ý nghĩa và chuẩn bị một vòng quay mới với sự chín chắn và trưởng thành hơn rất nhiều!")
  else:
    print("so khong ton tai")
else:
  print("ngay sinh khong ton tai")