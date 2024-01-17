package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application02 {
    public static void main(String[] args) {
        /* 다양한 타입의 예외를 multi catch block을 이용해서 처리 할수 있다. */
        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnougMoney(30000,200000);

            /* 예외 상황별로 catch 블럭을 따로 작성해서 처리 할 수 있다.*/
        } /*catch(Exception e) {
            multi catch block 사용시 유의할점은 위에서부터 아래로 진행하면서 자신의 예외 타입과 맞는경우
            동작하기 때문에 상위 타입의 exception이 먼저 서술 되면 하단의 catch block으로는 절대
            도달할수 없어 컴파일 에러가 발생한다는 점이다 따라서 catch 블럭의
            서술순서는 하위 타입 ->상위 타입으로 서술해야한다
        }*/catch (PriceNegativeException e) {
            System.out.println("PrintNegativeException 발생");
            System.out.println(e.getMessage());
        } catch (MoneyNegativeException e) {
            System.out.println("MoneyNegativeException 발생");
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println("NotEnoughMoneyException 발생");
            System.out.println(e.getMessage());
        } finally {
            /* 예외 발생 여부와 상관 없이 실행할 내용 */
            System.out.println("finally 블럭의 내용이 동작함 ");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
