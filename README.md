Araç Alım-Satım Uygulaması (Spring Boot)
Bu uygulama, bir müşteri ile galerici arasındaki araç alım-satım sürecini yöneten bir Spring Boot tabanlı uygulamadır. Uygulama, kullanıcıların araç alım-satımı işlemlerini güvenli bir şekilde gerçekleştirmelerini sağlar ve döviz kuru üzerinden satış işlemleri yapılmasına olanak tanır.

Kullanılan Bağımlılıklar;
Java Spring Web
Lombok
Spring Data JPA
PostgreSQL Driver
Spring Security

Uygulama Özellikleri

Kullanıcı Kaydı:
JWT güvenlik mekanizması kullanılarak kullanıcı kaydı ve doğrulama işlemleri yapılır. Kullanıcı kayıt olduktan sonra, sistem tarafından bir access token verilir.

Token Yenileme:
Access token süresi dolduğunda, refresh token kullanılarak yeni bir access token alınabilir. Bu sayede kullanıcılar, sürekli olarak yeniden giriş yapmak zorunda kalmazlar.

Adres, Hesap ve Müşteri Yönetimi:
Müşteri ve galerici bilgileri, adres, hesap gibi detaylar veritabanında saklanır. Kullanıcılar, bu bilgileri API üzerinden yönetebilirler.

Araç Yönetimi:
Araç bilgileri veritabanına eklenebilir, güncellenebilir ve galericilerle ilişkilendirilebilir. Araçlar, galericiler tarafından satışa sunulabilir.

Döviz Kuru:
Merkez Bankası'ndan döviz kuru verileri alınabilir. Araç satış işlemleri, döviz kuru üzerinden yapılır ve TL-USD dönüşümleri gerçekleştirilebilir.

Araç Satın Alma:
Müşteriler, yeterli paraya sahipse, galericiden araç satın alabilirler. Ancak, bir müşteri bir aracı satın aldıysa, aynı araç başka bir müşteri tarafından satın alınamaz.
