package utils;

public class StringUtils {

    /**
     * commaString에 Comma(,)가 포함되어있는지 판단 </br>
     * <br/>&nbsp;&nbsp; include: 일부분 포함하다.
     * <br/>&nbsp;&nbsp; contain: 내용물로서 포함핟다.(전체)
     */
    public boolean isIncludeComma(String commaString) {
        String splitStandardString = ",";
        String[] strArray = commaString.split(splitStandardString);
        return strArray.length > 0;
    }


    /**
     * 입력된 차 이름이 5글자 이하인지 판단 </br>
     */
    public boolean validationCarName(String carName) {
        return carName.length() < 5;
    }
}
