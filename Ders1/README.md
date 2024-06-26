# Data Soyutlama

Soyutlama sözcüğü birazda kafa karıştırıcı gelebilir ancak oldukça mantıklıdır. Zaten yazılımda her şey "MANTIK" temellidir. Sadece kaynağı bilmek gerekir. Burada soyutlamanın kullanımı verinin gereksiz detaylarının bizim için soyut olmasıdır.

> String name = "isim";

şeklinde bir değişken belirtildiğinde bu değişken cihazınızın içinde fiziksel bir yerde tutulur. Cihazınız 1 ve 0 lar ile bu değişken bilgisini tutmak için fiziksel olarak ram bileşeninde değişiklik yapar. Bu değişikliğin bir lokasyonu vardır. Ancak genelde bunu bilmemize gerek olmaz. Bu noktada verinin fiziksel lokasyonu bizim için "soyurlanmış"tır.

Soyutlanma terimi artık mantıklı geliyor ise soyutlamanın üç katmanına bakalım -> fiziksel, mantıksal ve görünüm.

# Fiziksel Soyutlama

Bilginin bulunduğu disk içi lokasyondur. İster bilgisayarında ister devasa bir cloud hizmet sağlayıcısının data merkezi olsun her veri aslında bir sürü elektronun bir yerde tutulması ile olur. Bu konuyu merak ediyorsan charge trap flash hücrelerine bakabilirsin. Neyse ki bu şimdilik bizim "soyutlayabileceğimiz" bir donanım konusu.

# Kavramsal Soyutlama

Bir obje içinde bir sürü değişken tutabiliriz. Örneğin bir firma için sistem kuruyor olalım. Çalışanlar için bir sınıf oluşturmamız gerekir. Çalışanın ismi, soyadı ve şirket içi departmanı tutmamız gereken verilerden olacaktır. Ancak eğer çok spesifik bir sebebimiz yoksa dedesinin doğduğu hastanenin yatak sayısı gibi bir veri oldukça absürt olacaktır. Kavramsal soyutlama bizim için önemli ve gerekli olan bilgilerin bir sınıf altında toplanmasıdır.

# Görünüm seviyesi

Dış katman olarakta bilinir. Burada yeni bir detay katılacak sisteme. Önceki örnekte işlemlerimizi kolaylaştırmak adına bir de çalışan idleri ekledik diyelim. Ayrıca şirket içi muhasebe için maaş bilgileri de eklenmiş olsun.

Ancak şirketimizin web sitesinde çalışanların id ve maaş bilgisi gözükse hoş olmaz. Bu soyutlamada veriyi sunarken paylaşılmasında sakınca olmayan ve bakan kişiyi ilgilendiren veriyi sunmak olur.

Örneğin bir araç paylaşımı firması için çalışanın araç bilgisini paylaşmak mantıklı iken bir fotoğrafçılık şirketinin bu bilgiyi paylaşması gerekli olmayabilir, araçlı çekimler yapan özel bir firma değilse.

# Abstract Data Type

ADT olarak bilinen bu sistem aslında oldukça basit bir mantık. Çalışan için basit bir abstract veri tipi oluşturalım. Bunun için adt klasörüne bak.

# ADT

ilk oluşan sınıfta verileri tutabiliyoruz ancak istersem idyi değiştirmek mümkün ve salaryi -10 yaptım. Çalışmak için bize para verecek birini bulmak güzel olurdu.
Veri tipimizin düzgün çalışması için minik bir OOP sihri lazım.
