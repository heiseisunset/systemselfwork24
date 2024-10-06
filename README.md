本项目内容为一个简易的acg网站后端，参考的网站主要有萌娘百科（https://zh.moegirl.org.cn/%E6%88%98%E5%9C%B04/%E5%A4%9A%E4%BA#/flow），灰机wiki（https://dontstarve.huijiwiki.com/wiki/首页），灾厄中文wiki（http://soammer.com/）等acg百科类网站

项目使用springboot框架+maven+jba动态数据库操作，使用navicat和postman检测后端数据库和前后端数据传输，实现了简易的增删改查功能

项目参考wiki大类数据库构成（https://github.com/salesforce/WikiSQL），设置以下数据表：
表
这些文件包含在文件中。一行如下所示：

{
   "id":"1-1000181-1",
   "header":[
      "State/territory",
      "Text/background colour",
      "Format",
      "Current slogan",
      "Current series",
      "Notes"
   ],
   "types":[
      "text",
      "text",
      "text",
      "text",
      "text",
      "text"
   ],
   "rows":[
      [
         "Australian Capital Territory",
         "blue/white",
         "Yaa\u00b7nna",
         "ACT \u00b7 CELEBRATION OF A CENTURY 2013",
         "YIL\u00b700A",
         "Slogan screenprinted on plate"
      ],
      [
         "New South Wales",
         "black/yellow",
         "aa\u00b7nn\u00b7aa",
         "NEW SOUTH WALES",
         "BX\u00b799\u00b7HI",
         "No slogan on current series"
      ],
      [
         "New South Wales",
         "black/white",
         "aaa\u00b7nna",
         "NSW",
         "CPX\u00b712A",
         "Optional white slimline series"
      ],
      [
         "Northern Territory",
         "ochre/white",
         "Ca\u00b7nn\u00b7aa",
         "NT \u00b7 OUTBACK AUSTRALIA",
         "CB\u00b706\u00b7ZZ",
         "New series began in June 2011"
      ],
      [
         "Queensland",
         "maroon/white",
         "nnn\u00b7aaa",
         "QUEENSLAND \u00b7 SUNSHINE STATE",
         "999\u00b7TLG",
         "Slogan embossed on plate"
      ],
      [
         "South Australia",
         "black/white",
         "Snnn\u00b7aaa",
         "SOUTH AUSTRALIA",
         "S000\u00b7AZD",
         "No slogan on current series"
      ],
      [
         "Victoria",
         "blue/white",
         "aaa\u00b7nnn",
         "VICTORIA - THE PLACE TO BE",
         "ZZZ\u00b7562",
         "Current series will be exhausted this year"
      ]
   ]
}
这些字段表示以下内容：

id：表 ID。
header：表中的列名列表。
rows：行列表。每行都是行条目的列表。
表也包含在相应的文件中。 这是一个具有相同信息的 SQL 数据库。 请注意，由于 HTML 表格的格式灵活，数据库中表格的列名已被符号化。 

上述数据可供一个独立的acg角色页面的个性化构成，允许多人编辑，允许角色查询
