package jpabook.jpashop.api;

/**
 * V1. 엔티티 직접 노출
 * - 엔티티가 변하면 API 스펙이 변함
 * - 트랜잭션 안에서 지연 로딩 필요
 * - 양방향 연관관계 문제
 *
 * V2. 엔티티를 조회해서 DTO로 변환(fetch join 사용 x)
 * - 트랜잭션 안에서 지연로딩 필요
 *
 * V3. 엔티티를 조회해서 DTO로 변환(fetch join 사용 O)
 * - 페이징 시에는 N부분을 포기해야 함(대신에 betch fetch size? 옵션 주면 N -> 1 쿼리로 변경 가능)
 *
 * V4. JPA에서 DTO로 바로 조회, 컬렉션 N 조회(1 + N Query)
 * - 페이징 가능
 *
 * V5. JPA에서 DTO로 바로 조회, 컬렉션 1 조회 최적화 버전(1 + 1 Query)
 * - 페이징 가능
 *
 * V6. JPA에서 DTO로 바로 조회, 플랫 데이터(1Query) (1Query)
 * - 페이징 불가능..
 */
public class OrderApiController {
}
