# 一级标题
## 二级标题
### 三级标题
#### 四级标题
##### 五级标题

正文

```java
System.out.println("Hello, World!");
```

```python
print("Hello, World!")
```

正文中的代码`System.out.println("Hello, World!");`

1. 列表1
   * 嵌套列表1
   + 嵌套列表2
   - 嵌套列表3

**加粗**  
*倾斜*  
~~删除线~~  
<u>下划线</u>  

使用 Markdown[^1]可以效率的书写文档, 直接转换成 HTML[^2], 你可以使用 Typora[^T] 编辑器进行书写。
[^1]:Markdown是一种纯文本标记语言
[^2]:HyperText Markup Language 超文本标记语言
[^T]:NEW WAY TO READ & WRITE MARKDOWN.

> 区块
> > 嵌套区块

| 左对齐 | 右对齐 | 居中对齐 |
| :-----| ----: | :----: |
| 单元格 | 单元格 | 单元格 |
| 单元格 | 单元格 | 单元格 |

```mermaid
sequenceDiagram

Alice->>John: Hello John, how are you?
loop Healthcheck
John->>John: Fight against hypochondria
end
Note right of John: Rational thoughts!
John-->>Alice: Great!
John->>Bob : How about you?
Bob-->>John : Jolly good!
```

```mermaid
classDiagram

  Class01 <|-- AveryLongClass: Cool
  <<interface>> Class01
  Class09-->C2: Where am i?
  Class09 --* C3
  Class09 --|> Class07
  Class07: equals()
  Class07: Object[] elementData
  Class01: size()
  Class01: int chimp
  Class01: int gorilla
  class Class10 {
  <<service>>
  int id
  size()
 }
```
![图片](C:/Users/Lenovo/Desktop/微信图片_20220601164600.png)
