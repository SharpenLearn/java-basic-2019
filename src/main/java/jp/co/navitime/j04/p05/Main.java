package jp.co.navitime.j04.p05;

/*
 * 以下の説明を読んで, 指示通りに商品クラスを作成せよ.
 *
 * 状況説明:
 * - 商品は, 商品名と新品価格が決まっている.
 * - 商品には, 新品, 中古品の状態がある.
 * - 商品の状態は変化することがある.
 * - 中古品は新品の 30% 引きの価格で販売される.
 * - 新品には無料保証がついているが, 中古品には無料保証がついていない.
 * - 将来的に, 新古品, ジャンクなどの種別の追加を検討している.
 *   - 新品との価格差は未定で, 定額値引きかもしれないし, 割合値引きかもしれない.
 *   - 無料保証の有無も未定である.
 *
 * 実装指示:
 * 1. 状態を表すインターフェース State を定義せよ. State は以下をもつこと.
 *     - 新品価格を渡すと, 販売価格を返すメソッド.
 *     - 無料保証の有無を返すメソッド.
 * 2. 商品を表す Item クラスおよびその単体テスト実装せよ.
 *    このとき Item が持つ State 型インスタンスには mock を用いよ.
 *    Item は以下をもつこと.
 *     - 商品名の属性.
 *     - 新品価格の属性.
 *     - 商品状態の属性 (State 型インスタンス).
 *     - 販売価格を返すメソッド.
 *     - 無料保証の有無を返すメソッド.
 * 3. State インタフェースを実装した新品状態クラス NewState と,
 *    その単体テストを実装せよ.
 * 4. State インタフェースを実装した中古品状態クラス UsedState と,
 *    その単体テストを実装せよ.
 * 5. main メソッドでユースケースを確認せよ.
 */
public class Main {
}
