Markdown 是一种轻量级标记语言，使用简单而且常用的标记符号作为语法，纯文本，兼容性强，排版简洁  
Github、Gitlab等都支持Markdown

markdown编辑、预览：markdown all in one
格式检查工具：markdownlint
画图工具：markdown preview mermaid support

typora

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

| 左对齐标题 | 右对齐标题 | 居中对齐标题 |
| :------| ------: | :------: |
| 短文本 | 中等文本 | 稍微长一点的文本 |
| 稍微长一点的文本 | 短文本 | 中等文本 |

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
alt condition1
Alice->John: result1
else condition2
Alice->John: result2
end
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

 class Animal {
        +String publicField
        #Integer protectedField
        ~Boolean packageField
        -Long privateField
        Double staticField$

        +publicMethod() String
        #protectedMethod() Integer
        ~packageMethod() Boolean
        -privateMethod() Long
        +abstractMethod()* void
        #staticMethod()$ char
    }
```
![图片](20220601164600.png "测试图片")

```mermaid
graph TD
  A[Christmas] -->|Get money| B(Go shopping)
  B --> C{Let me think}
  C -->|One| D[Laptop]
  C -->|Two| E[/iPhone\]
  C -->|Three| F[/Car/]
  ```