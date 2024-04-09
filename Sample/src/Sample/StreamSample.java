package Sample;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample {

    public static void main(String[] args) {
        
        List<String> places = new ArrayList<>();
        
        places.add("アイスランド");
        places.add("スペイン");
        places.add("ナポリ");
        places.add("リスボン");
        places.add("ヨセミテ国立公園");
        
        
        // forEachを使った単純な出力
        System.out.println("■Stream forEachによる取得：");
        places.stream().forEach(place -> System.out.println(place));
        //places.stream()でplacesのストリームを生成
        
        
        // filterを使って特定の条件に一致する要素のみを抽出
        System.out.println("■「ン」で終わる場所のみ抽出：");
        places.stream() //placesのストリームを生成
              .filter(place -> place.endsWith("ン")) 
              //endsWithで「ン」で終わるかチェック、filterで特定の条件に一致する要素だけを抽出
              .forEach(place -> System.out.println(place));
        
        
        
        // mapを使って各要素を加工
        System.out.println("■各場所名の長さを表示：");
        places.stream()
        
              //各要素(place)を、その名前のとその長さの情報を含む新しい文字列に変換
              //もともと国名が入っていたが、アイスランドの長さ：６という文字列に変わった
              .map(place -> place + "の長さ:" + place.length())
              .forEach(place -> System.out.println(place));
              
        
     // collectを使って結果を別のリスト(filteredPlaces)に格納
        List<String> filteredPlaces = places.stream() //placesのストリームを生成
                .filter(place -> place.contains("ス"))
                .collect(Collectors.toList());//ストリームの結果を新しいリストに集める
        System.out.println("「ス」を含む場所：" + filteredPlaces);
    }

}
