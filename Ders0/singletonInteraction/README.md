Eğer Terminalden bunu çalıştırıyorsan muhtemelen hata alcaksın
çünkü java runtime için dosya yerlerini analamak önemli

termianlde bu dosyanın içinde iken

> java runner
> yaparsan Singletonu bulamaz. Çünkü singleton, singletonInteraction paketinin içindedir.
> Java paketi arar.
> sen paketin içinde olduğundan bulamaz.

Şöyle düşün;
javaya telefon edip siyah bir doblo görüp görmediğini soruyorsun.  
O sırada arabada olan java dışarı bakıyor ve hayır görmedim diyor.
Aslında içinde bulunduğu araba siyah doblo.

bu yüzden önce javaya dışarı çık demen lazım. Bunun için current working directory bi üst dosyan olmalı.
bu yüzden cd .. komutu ile singletonInteraction dışına çık.

> javac singletonInteraction/Singleton.java singletonInteraction/Runner.java
> ile classlarını derle
> java singletonInteraction/Runner

ile yürüt.

biraz dertli gibi ama alında mantıklı. Daha güzel yaklaşım ise şu olacak

main.java dosyan ve tüm gerekli paketler aynı directoryde iken sadece maini java ile yürütmek.

Ancak burada kusursuz çalışan şeyler yerine problemleri ve onları çözmeyi görüyoruz.
