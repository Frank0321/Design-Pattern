# Design-Pattern
設計模式 sample code

# Factory-Pattern
工廠模式

# Strategy-Pattern
策略模式
- 主要解決：在多種算法相似的狀況下，使用 if else 所帶來的複雜與難以維護．
- 使用時機：一個系統有多個類別，而區分它們只是他們的直接行為
- 如何解決：將算法封裝成一個類別，任意進行抽換
- 參考：https://www.runoob.com/design-pattern/strategy-pattern.html

# Factory-Pattern 與 Strategy-Pattern 差異
- 簡單工廠模式是用來建立物件的模式，關注物件如何被產生 
  - 工廠模式中的工廠類別並不會去使用產品，因為工廠模式只關注在如何產生建立物件
  
- 策略模式是一種行為模式，關注的是行為的封裝 
  - 在策略模式中的環境類別則是使用外部傳入的策略類別，因此我們必須知道傳入策略的實際內容才行
- https://skyyen999.gitbooks.io/-study-design-pattern-in-java/content/strategySimpleFactory.html 


# 參考資料
https://ianjustin39.github.io/ianlife/design-pattern/strategy-pattern/