CREATE DATABASE IF NOT EXISTS tech;
use tech;
CREATE TABLE IF NOT EXISTS contents (
                                        id INT AUTO_INCREMENT PRIMARY KEY, -- ID column, auto-incremented
                                        content_token VARCHAR(255) NOT NULL, -- Token associated with the content
                                        tech VARCHAR(255) NOT NULL, -- Technology associated with the content
                                        title VARCHAR(255) NOT NULL, -- Title of the content
                                        content_kor TEXT, -- Korean content description
                                        content_eng TEXT, -- English content description
                                        is_send BOOLEAN DEFAULT FALSE, -- Flag indicating whether the content is sent
                                        send_date TIMESTAMP, -- Date when the content was sent
                                        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Timestamp when the record was created
                                        modified_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP -- Timestamp for the last update
);


insert into contents (id, content_token, tech, title, content_kor, content_eng, is_send, send_date, created_at,
                      modified_at)
values (1, 'content_1', 'BACKEND', '인스턴스와 클래스가 차이에 대해 설명해주세요.', '클래스는 객체를 만들기 위한 설계도이고, 인스턴스는 이 설계도를 통해 만들어진 실제 객체입니다.

예를 들어, 자동차 클래스가 있다면 실제 도로를 달리는 개별 자동차들이 인스턴스입니다.',
        'Instance is a concrete object created from a class, while a class is a blueprint or template that defines the attributes and methods that an object will have. The class serves as a template for creating multiple instances, each with its own unique state but sharing the same structure and behavior defined by the class.',
        0, null, '2025-01-05T21:48:38', '2025-01-05T21:48:38'),
       (2, 'content_2', 'BACKEND', 'JVM의 동작 방식과 가비지 컬렉션에 대해 설명해주세요.',
        'JVM은 자바 프로그램을 실행하는 가상 머신으로, 클래스 로더가 .class 파일을 로드하고 실행엔진이 바이트코드를 해석합니다. 메모리는 힙, 스택, 메소드 영역으로 나뉘며, 가비지 컬렉션이 더 이상 참조되지 않는 객체를 자동으로 제거하여 메모리를 관리합니다.',
        'JVM is a virtual machine that executes Java programs and handles memory management through garbage collection.',
        0, null, '2025-01-05T21:48:38', '2025-01-05T21:48:38'),
       (3, 'content_3', 'BACKEND', 'REST API와 RESTful 서비스의 차이점은 무엇인가요?',
        'REST API는 기본적인 REST 아키텍처를 따르는 API이며, HTTP 메소드를 사용하여 리소스를 처리합니다. RESTful 서비스는 REST의 모든 제약조건(Stateless, 캐시 가능성, 균일한 인터페이스 등)을 완벽히 만족하는 서비스로, HATEOAS를 포함한 모든 REST 원칙을 준수합니다.',
        'REST API follows basic REST architecture, while RESTful services fully comply with REST constraints.', 0, null,
        '2025-01-05T21:48:38', '2025-01-05T21:48:38'),
       (4, 'content_4', 'BACKEND', '데이터베이스 인덱싱의 장단점에 대해 설명해주세요.',
        '인덱스는 B-tree 또는 해시 구조를 사용하여 데이터 검색 속도를 향상시킵니다. WHERE 절에서 자주 사용되는 컬럼에 인덱스를 생성하면 효과적이지만, 추가적인 저장 공간이 필요하고 INSERT, UPDATE, DELETE 작업 시 인덱스도 함께 수정해야 하므로 성능이 저하될 수 있습니다.',
        'Indexing improves search speed but requires additional storage and can slow down insert/update/delete operations.',
        0, null, '2025-01-05T21:48:38', '2025-01-05T21:48:38'),
       (5, 'content_5', 'BACKEND', '마이크로서비스 아키텍처의 장단점은 무엇인가요?',
        '마이크로서비스는 각 서비스를 독립적으로 개발, 배포, 확장할 수 있으며 다양한 기술 스택 사용이 가능합니다. 하지만 서비스 간 통신 복잡성이 증가하고, 분산 트랜잭션 관리가 어려우며, 전체 시스템의 일관성 유지가 challenging할 수 있습니다.',
        'Independent development and deployment of services is possible, but inter-service communication becomes more complex.',
        0, null, '2025-01-05T21:48:38', '2025-01-05T21:48:38'),
       (6, 'content_6', 'BACKEND', '동기와 비동기 처리의 차이점을 설명해주세요.',
        '동기 처리는 요청한 작업이 완료될 때까지 다음 작업을 수행하지 않고 대기하는 방식입니다. 반면 비동기 처리는 작업을 요청한 후 완료 여부와 관계없이 다음 작업을 수행할 수 있으며, 콜백 함수나 Promise를 통해 작업 완료 후의 처리를 정의할 수 있습니다.',
        'Synchronous processing executes tasks sequentially, while asynchronous allows parallel execution.', 0, null,
        '2025-01-05T21:48:38', '2025-01-05T21:48:38'),
       (7, 'content_7', 'BACKEND', '스프링의 DI(의존성 주입)와 IoC(제어의 역전)에 대해 설명해주세요.',
        'DI는 객체 간의 의존관계를 외부에서 주입하여 결합도를 낮추고 유연성을 높이는 방식입니다. IoC는 객체의 생성과 생명주기 관리를 스프링 컨테이너가 담당하여 개발자가 비즈니스 로직에 집중할 수 있게 합니다. @Autowired나 생성자 주입을 통해 구현할 수 있습니다.',
        'DI injects dependencies externally, while IoC manages object lifecycle through the container.', 0, null,
        '2025-01-05T21:48:38', '2025-01-05T21:48:38'),
       (8, 'content_8', 'BACKEND', '캐싱 전략과 구현 방법에 대해 설명해주세요.',
        '캐시는 자주 사용되는 데이터를 메모리에 저장하여 빠른 접근을 가능하게 합니다. Redis나 Memcached같은 인메모리 캐시를 사용할 수 있으며, LRU, LFU 등의 캐시 교체 알고리즘을 통해 캐시 메모리를 효율적으로 관리합니다.',
        'Caching improves performance by storing frequently accessed data in quick-access storage.', 0, null,
        '2025-01-05T21:48:38', '2025-01-05T21:48:38'),
       (9, 'content_9', 'BACKEND', '동시성 제어를 어떻게 구현하나요?',
        'synchronized 키워드, ReentrantLock, Semaphore 등을 사용하여 공유 자원에 대한 접근을 제어합니다. 데드락을 방지하기 위해 락 획득 순서를 일관되게 유지하고, 타임아웃을 설정하며, 필요한 경우 낙관적 락이나 비관적 락을 사용합니다.',
        'Access to shared resources is controlled using locks or semaphores while preventing deadlocks.', 0, null,
        '2025-01-05T21:48:38', '2025-01-05T21:48:38'),
       (10, 'content_10', 'BACKEND', '보안 취약점을 어떻게 방지하나요?',
        '입력값 검증(Validation), PreparedStatement를 사용한 SQL 인젝션 방지, XSS 방지를 위한 문자열 이스케이프, CSRF 토큰 사용, 적절한 인증과 인가 처리, HTTPS 사용 등 다양한 보안 대책을 구현합니다. 정기적인 보안 감사와 업데이트도 중요합니다.',
        'Implement various security measures including input validation, SQL injection prevention, and XSS prevention.',
        0, null, '2025-01-05T21:48:38', '2025-01-05T21:48:38'),
       (11, 'content_11', 'BACKEND', '서버 성능 최적화 방법에 대해 설명해주세요.',
        '데이터베이스 인덱싱, 커넥션 풀링, 캐싱 전략 수립, N+1 문제 해결, 비동기 처리 활용 등을 통해 서버의 처리 속도를 개선합니다. 또한 로드 밸런싱을 통한 부하 분산, 데이터베이스 쿼리 최적화, 적절한 로깅 전략 수립도 중요합니다.',
        'Improve server processing speed and responsiveness using caching, indexing, and connection pooling.', 0, null,
        '2025-01-05T21:48:38', '2025-01-05T21:48:38');
