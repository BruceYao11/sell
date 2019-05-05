<html>
<#include "../common/header.ftl">

<body>

<div id="wrapper" class="toggled">
    <#--边栏-->
    <#include "../common/nav.ftl">

   <h3><strong>本月销售额：${amount}元</strong></h3>
</div>

<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
<div id="main" style="width: 600px;height:400px;margin-left: 200px"></div>

<script src="/sell/js/echarts.min.js"></script>
<script type="text/javascript">
   // 基于准备好的dom，初始化echarts实例
   var myChart = echarts.init(document.getElementById('main'));

   // 指定图表的配置项和数据
   var option = {
      title: {
         text: '商品销量'
      },
      tooltip: {},
      legend: {
         data:['销量']
      },
      xAxis: {
         data:${name}
      },
      yAxis: {},
      series: [{
         name: '销量',
         type: 'bar',
         data: ${quantity}
      }]
   };

   // 使用刚指定的配置项和数据显示图表。
   myChart.setOption(option);
</script>
</body>
</html>
