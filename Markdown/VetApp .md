# Veteriner Uygulası
## _Uygulama_

- Eclipse
- Maven Projesini import et
- MySQL
- Apache
## Giriş

- Proje içerisinde birden çok klasör yer almaktadır.
- Bunlar Spring mimarisine uygun olarak tasarlanmıştır.


✨  Projeye içersinde bilgiler tutulması amacıyla MYSQL kullanılmıştır. Apache yardımı alınmıştır.

## Proje Çalıştırma
✨ ✨ ✨  Proje ../src/main/java/com/vet/app içerisinde yer alan VetAppApplication.java çalıştırılmalıdır.

✨ ✨ ✨  Proje testi de gerçekleştirilmiştir.
Bunun için ise ../src/test/java/com/vet/app içerisinde yer alan UserRepositoryTest.java yazılmıştır. Burada kullanıcılar için Test işlemi gerçekleştirilmiştir.

## Proje Anlatımı
1) İlk olarak Spring Initialzr ile maven projemi, uygulamada kullanacağım dependency'leri seçtin ve generate ettim.
2) Burada ../src/main/java/com/vet/app içerisine ayrıca Model klasör'ü oluşturarak 3 farklı model oluşturdum. Bunlar hayvan, hayvanSahibi ve Login,
3) Ayrıca bunlar için api'lerin yer alacağı Controller ve datalara erişim için ise Repository klasörleri oluşturup her biri için bu dosyaları oluşturdum.
4) Controller'da GET ve POST metodlarını kullandım. Ayrıca bu metodları kullanırken ModelAndView'a da yer verdim ki html dosyalarını oluştururken kullanacağım dosya adlarını bu kısımda belirleyeyim ve verilerime rahatlıkla ulaşabileyim. 
>Bununla birlikte örneğin hayvanController.java içerisinde List kullandım. Bu database'de yer alan verileri alabilecek ayrıca Repository ile bağlantılı işlem gerçekleştireceği için .findAll()  ile hepsini görebileceğim.
5) Repository'leri de oluştuşturdum ve bu repository'leri JpaRepository ile extends ettim.  
>JpaRepository içerisinde önceden tanımlı metodlar (save(), findById(), delete() vs.) olduğu için kolaylık sağladı.
6) Hemen hemen diğer dosyalarımda da istenilen duruma göre aynı işlemleri gerçekleştirdim.Bununla birlikte şundan bahsetmek isterim;
loginConroller.java da biraz daha farklı işlemler gerçekleştirdim.
- - Burada yazmış olduğum @PostMapping metoduyla birlikte bir String oluşturdum. Optional class kullandım.Peki bu ne demek? 
- - Optioanl'da yer alan bazı parametreler benim if-else condition yazarken işime yarayacak. 
-  - Ben istiyorum ki Kullanıcı giriş yaparken email'i kayıtlı ise aynı email ile yeniden kayıt oluşturamasın.
-  - Ayrıca ben bu sefer kullanıcı sisteme giriş yaparken istiyorum ki email ve şifresi ile giriş yaparken doğru bilgileri girdiğinde giriş yapabilsin. 
-  - Bunların hepsi ayrı condition demek. Peki bu metodlar Optional içerisinde yer alıyor ama Repository'e de de bulunması gerekmez mi? Gerekir.
-  - Bunun için, loginRepository içersine oluşturduğumuz metodları yazıyoruz.
-  Login kısmına giriş yapmışken TEST açıklaması da yapmalıyım.

7) ../src/test/java/com/vet/app içerisinde yer alan UserRepositoryTest.java yazdım. 
> Tabi ki, bu kısım için öncesinde dependcy eklemesi yapılması gerekmektedir.
```sh
<dependency>
    <groupId>org.assertj</groupId>
    <artifactId>assertj-core</artifactId>
    <scope>test</scope>
</dependency>
```
> asserThat kullandım. Bunu kullanma sebebim, assertThat bir değerin beklenen değerle eşleşip eşleşmediğini kontrol etmek için kullanılabilen Assert nesnesindeki JUnit yöntemlerinden biri olduğu için benim için uygundu.
8) İki Test yazdım;
- Test'i ilk olarak yeni bir kullanıcı oluştururken çalışıp çalışmadığını görmek amacıyla yazdım.
- Diğer Test'i ise az önce bahsetmiş olduğum kayıt olma sırasında aynı email ile daha önceden kayıt olunmaması durumu için yazdım.


## Bilgilendirme

- Web sunucusu olarak Tomcat ve ek olarak diğer birçok özellik içerdiği için Spring Boot kullanmayı tercih etim.
- Ayrıca burada dependency seçimlerimi yaptığım ve sonrasında .xml dosyası hazır halde geldi için işin bu kısmında kurtulup direkt olarak koduma odaklanabildim.
- Bunların yanı sıra Test işlemi gerçekleştirirken pom.xml'e bazı dependency'ler eklemek durumunda kaldım. Bunlar benim işimi kolaylaştırdı.

## Thymeleaf 
Bu ifadeler .html dosyalarında yer verdiğim ifadelerdir.

${...} : Değişken ifadeler
*{...} : Seçim ifadeleri
@{...} : Bağlantı (URL) ifadeleri


## Spring Boot

| Plugin | README |
| ------ | ------ |
| Medium | [SpringBoot](https://arifegulyalcinn.medium.com/spring-boota-giri%C5%9F-238e0109c3b8?source=your_stories_page----------------------------------------) |

Spring Boot Version
```sh
2.6.2
```

Java Sürüm

```sh
JAVA8
```

# Dependency
#### _Açıklamalar_

```sh
Spring Web
```
- Spring Web'i web tabanlı uygulamalar geliştirmek için kullanılan bir modül olması sebebiyle kullandım.
```sh
Thymeleaf
```
- Thymeleaf , hem web hem de bağımsız ortamlar için modern bir sunucu tarafı Java şablon motorudur.
- Yani, Thymeleaf kullanmamın sebebi html dosyasıyla projemi web'e uygun hale getirmektir. XML adları direkt olarak html ile bağlantı kurabiliyor. Yani sunum tarafındaki gereksiz kalabalık ortadan kalkıyor.

```sh
Spring Data JPA
```
- JPA, Java Persistence Api’nin kısaltmasıdır ve Java uygulamarında ilişkisel veriler için geliştirilmiş bir kütüphanedir. Bu demek oluyor ki Model oluştururken ve bunların diğer dosyalarla ilişiğini oluştururken bu kütüphaneden yardım aldım.

```sh
MYSQL Driver
```
- Verilerimi databasa'den almak veya kaydetmek amacıyla MYSQL ve Apache kullandım. Bunun için kodumda bağımlılık olarak MYSQL Driver'e yer verdim.


## EK

- [Spring Initialzr](https://start.spring.io/) 
- [Eclipse](https://www.eclipse.org/downloads/)
- [JQuery DataTables](https://datatables.net/) 
- [Junit](https://www.petrikainulainen.net/programming/testing/junit-5-tutorial-writing-assertions-with-assertj/)


