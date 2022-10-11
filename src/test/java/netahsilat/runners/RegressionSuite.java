package netahsilat.runners;

import netahsilat.*;
import org.junit.platform.suite.api.*;

@SelectPackages({"java/netahsilat"})
@Suite
@SuiteDisplayName("Netahsilat Regression Suite")
@SelectClasses({
        C345.class,  // Netahsilat Admin > Kullanıcı Girişi > Şifremi Unuttum Klasörü

        C365.class, C366.class, C367.class, // Netahsilat Admin > Kullanıcı Girişi > Şifre Kontrolü Zorunlu Klasörü

        C325.class, C326.class, C327.class, C329.class, C330.class,  // Netahsilat Admin > Anasayfa Testleri Klasörü

        C396.class, C397.class, C398.class, C399.class, C400.class, C401.class, C403.class, C402.class, C404.class, C406.class, // Netahsilat Admin > İşlemler > İşlem Listesi Klasörü
        C407.class, C408.class, C409.class, C410.class, C411.class, C413.class, C414.class, C416.class, C446.class, C539.class,
        C549.class, C740.class, C741.class, C1679.class, C1680.class, C548.class, C742.class, C743.class, C744.class, C746.class,
        C1227.class, C1315.class, C1367.class, C1310.class,

        C434.class, C436.class, C437.class, C429.class, C438.class, C428.class, C422.class, C432.class, C433.class, C431.class, // Netahsilat Admin > İşlemler > İşlem Detayları Listesi Klasörü
        C445.class, C1226.class, C541.class, C547.class, C760.class,

        C448.class, C443.class, C513.class, C457.class, C467.class, C471.class, C473.class, C477.class, C480.class, C481.class, // Netahsilat Admin > İşlemler > Geri Ödeme Detayları Klasörü
        C499.class, C490.class, C491.class, C492.class, C546.class,

        C516.class, C522.class, C523.class, C518.class, C519.class, C524.class, C525.class, C520.class, C526.class, C527.class, // Netahsilat Admin > İşlemler > Çek Senet Listesi Klasörü
        C521.class, C529.class, C530.class, C531.class, C550.class, C551.class, C949.class, C950.class, C951.class,

        C536.class, C552.class, C534.class, C533.class, C532.class, C537.class, C538.class, C559.class, C535.class, C557.class,
        C558.class, C554.class, C553.class, C555.class, C556.class, C785.class, C582.class, C587.class, C588.class, C589.class,
        C586.class, C590.class, C591.class, C592.class, C585.class, C583.class, C584.class, C575.class, C580.class, C576.class,
        C578.class, C581.class, C584.class, C1352.class, C613.class, C626.class, C614.class, C617.class, C616.class, C618.class,
        C619.class, C620.class, C621.class, C622.class, C623.class, C624.class, C625.class, C1321.class, C1831.class, C805.class,
        C1231.class, C631.class, C1670.class, C632.class, C633.class, C634.class, C635.class, C636.class, C637.class, C638.class,
        C639.class, C1322.class, C859.class, C860.class, C861.class, C862.class, C1850.class, C863.class, C1230.class, C1341.class,
        C1561.class, C1832.class, C640.class, C642.class, C643.class, C644.class, C646.class, C645.class, C864.class, C1833.class,
        C628.class, C675.class, C676.class, C729.class, C1402.class, C730.class, C1880.class, C732.class, C769.class, C770.class,
        C771.class, C773.class, C788.class, C793.class, C796.class, C804.class, C849.class, C1343.class, C782.class, C1484.class,
        C1479.class, C1480.class, C1482.class, C1483.class, C1573.class, C774.class, C747.class, C748.class, C749.class, C750.class,
        C751.class, C1246.class, C803.class, C752.class, C753.class, C1969.class, C1970.class, C1971.class, C827.class, C828.class, C1362.class,
        C829.class, C712.class, C1673.class, C717.class, C714.class, C1942.class, C716.class, C781.class, C794.class, C852.class,
        C853.class, C854.class, C1363.class, C713.class, C715.class, C739.class, C736.class, C1659.class, C737.class, C1333.class,
        C738.class, C1218.class, C1660.class, C755.class, C757.class, C3275.class, C754.class, C5288.class, C3296.class, C2087.class,
        C2088.class, C2089.class, C2090.class, C2092.class, C2093.class, C2094.class, C2095.class, C2096.class, C3276.class, C2097.class,
        C2098.class, C2099.class, C2100.class, C2101.class, C2102.class, C2103.class, C2007.class, C2008.class, C2009.class, C2010.class, C2011.class,
        C2012.class, C2013.class, C2014.class, C2015.class, C2017.class, C2018.class, C2016.class, C2081.class, C2082.class, C758.class,
        C2083.class, C2084.class, C2085.class, C786.class, C787.class, C2019.class, C2020.class, C2022.class, C1309.class, C724.class, C2024.class,
        C2023.class, C726.class, C728.class, C1653.class, C1874.class, C727.class, C2107.class, C891.class, C990.class, C991.class,
        C992.class, C1222.class, C1224.class, C1397.class, C3239.class, C3240.class, C3241.class, C3244.class, C3247.class, C3249.class, C3250.class,
        C3251.class, C3252.class, C3831.class, C3832.class, C3255.class, C3256.class, C3257.class, C3258.class, C3259.class, C3260.class, C3261.class,
        C3265.class, C3233.class, C3262.class, C3267.class, C3269.class, C3270.class, C3271.class, C3272.class, C3853.class, C775.class, C879.class,
        C815.class, C1663.class, C5233.class, C5234.class, C5235.class, C5236.class, C5281.class, C886.class, C887.class, C889.class, C888.class,
        C5287.class, C890.class, C1689.class, C4526.class, C4527.class, C4527.class, C1690.class, C1692.class, C4529.class, C4530.class, C4597.class,
        C1798.class, C1799.class, C1800.class, C1801.class, C1802.class, C1802.class, C5343.class, C5344.class, C1803.class, C1804.class, C1809.class,
        C1941.class, C4598.class, C1693.class, C1694.class, C1695.class, C1884.class, C1700.class, C1701.class, C1702.class, C1703.class, C6424.class,
        C6425.class, C6426.class, C1704.class, C1706.class, C1707.class, C1708.class, C6432.class, C5351.class, C1716.class, C1717.class, C1718.class,
        C1719.class, C5380.class, C1888.class, C5382.class, C5381.class, C1889.class, C1890.class, C1891.class, C1892.class, C1893.class, C1896.class,
        C1897.class, C1898.class, C1899.class, C1900.class, C1900.class, C1902.class, C1903.class, C1909.class, C1910.class, C1912.class, C1913.class,
        C1914.class, C1917.class, C1918.class, C1919.class, C1920.class, C1936.class, C2076.class, C2692.class


})
public class RegressionSuite {
}