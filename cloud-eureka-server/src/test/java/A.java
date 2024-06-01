import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * @author tql
 * @date 2023/10/13-10:47
 */
public class A {

    public static void main(String[] args) {
        String a = "{\"success\":true,\"code\":2000,\"desc\":\"请求成功\",\"data\":{\"records\":[{\"projectId\":\"1645362561763323906\",\"projectName\":\"物流工程\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"新疆广汇新能源有限公司-段祥东\",\"customerId\":\"1642818227583811585\",\"customerName\":\"新疆广汇新能源有限公司\",\"customerNature\":1,\"customerSignerName\":\"段祥东\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"20793.83\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"6694.75\",\"availableInvoiceAmount\":\"-6694.75\",\"amount2Pay\":\"20793.83\",\"unWriteOffAmount\":\"20793.83\",\"unpaidAmount\":\"20793.83\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"已逾期\",\"overdueAmount\":\"13351.01\",\"deadlineOverdueAmount\":\"2996.46\"},{\"projectId\":\"1644213847175131137\",\"projectName\":\"时代方舟机联工程\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"广州恒大实业集团有限公司-段祥东\",\"customerId\":\"1644223310992961537\",\"customerName\":\"广州恒大实业集团有限公司\",\"customerNature\":1,\"customerSignerName\":\"段祥东\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"24444.97\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"24444.97\",\"unWriteOffAmount\":\"24444.97\",\"unpaidAmount\":\"24444.97\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"已逾期\",\"overdueAmount\":\"3738.43\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1644249580183154689\",\"projectName\":\"锁定库存工程\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"新疆广汇新能源有限公司-段祥东\",\"customerId\":\"1642818227583811585\",\"customerName\":\"新疆广汇新能源有限公司\",\"customerNature\":1,\"customerSignerName\":\"段祥东\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"990.00\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"990.00\",\"unWriteOffAmount\":\"990.00\",\"unpaidAmount\":\"990.00\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"已逾期\",\"overdueAmount\":\"990.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1673958405865156610\",\"projectName\":\"0731-1万杰测试工程\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"南京钢铁股份有限公司-冯万杰\",\"customerId\":\"1673256468018573314\",\"customerName\":\"南京钢铁股份有限公司\",\"customerNature\":1,\"customerSignerName\":\"冯万杰\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"16663.92\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"16663.92\",\"unWriteOffAmount\":\"16663.92\",\"unpaidAmount\":\"16663.92\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"已逾期\",\"overdueAmount\":\"0.07\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1645362561763323906\",\"projectName\":\"物流工程\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"广州恒大实业集团有限公司-段祥东\",\"customerId\":\"1644223310992961537\",\"customerName\":\"广州恒大实业集团有限公司\",\"customerNature\":1,\"customerSignerName\":\"段祥东\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"19163.86\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"19163.86\",\"unWriteOffAmount\":\"19163.86\",\"unpaidAmount\":\"19163.86\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1696361263153954817\",\"projectName\":\"0829双奔测试001\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"南京钢铁股份有限公司-蒋双奔\",\"customerId\":\"1696361932111888385\",\"customerName\":\"南京钢铁股份有限公司\",\"customerNature\":1,\"customerSignerName\":\"蒋双奔\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"329.50\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"329.50\",\"unWriteOffAmount\":\"329.50\",\"unpaidAmount\":\"329.50\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1648286856837566465\",\"projectName\":\"小嘿工程\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"新疆广汇新能源有限公司-段祥东\",\"customerId\":\"1642818227583811585\",\"customerName\":\"新疆广汇新能源有限公司\",\"customerNature\":1,\"customerSignerName\":\"段祥东\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"8212.88\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"8212.88\",\"unWriteOffAmount\":\"8212.88\",\"unpaidAmount\":\"8212.88\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1673954013237686273\",\"projectName\":\"万杰测试工程0628\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"南京钢铁股份有限公司-冯万杰\",\"customerId\":\"1673256468018573314\",\"customerName\":\"南京钢铁股份有限公司\",\"customerNature\":1,\"customerSignerName\":\"冯万杰\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"0.00\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"0.00\",\"unWriteOffAmount\":\"0.00\",\"unpaidAmount\":\"0.00\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"0.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1686278242493030401\",\"projectName\":\"程宪意测试0801\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"吴江嘉伦织造有限公司-程宪意\",\"customerId\":\"1688809022008090625\",\"customerName\":\"吴江嘉伦织造有限公司\",\"customerNature\":1,\"customerSignerName\":\"程宪意\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"4.00\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"4.00\",\"unWriteOffAmount\":\"4.00\",\"unpaidAmount\":\"4.00\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1645362561763323906\",\"projectName\":\"物流工程\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"南京钢铁股份有限公司-冯万杰\",\"customerId\":\"1673256468018573314\",\"customerName\":\"南京钢铁股份有限公司\",\"customerNature\":1,\"customerSignerName\":\"冯万杰\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"1220.00\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"1220.00\",\"unWriteOffAmount\":\"1220.00\",\"unpaidAmount\":\"1220.00\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1656620315273584642\",\"projectName\":\"二级spu工程\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"广州恒大实业集团有限公司-段祥东\",\"customerId\":\"1644223310992961537\",\"customerName\":\"广州恒大实业集团有限公司\",\"customerNature\":1,\"customerSignerName\":\"段祥东\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"8060.34\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"8060.34\",\"unWriteOffAmount\":\"8060.34\",\"unpaidAmount\":\"8060.34\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1669587875464941569\",\"projectName\":\"询价工具冒烟-吕荣武\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"新疆广汇新能源有限公司-段祥东\",\"customerId\":\"1642818227583811585\",\"customerName\":\"新疆广汇新能源有限公司\",\"customerNature\":1,\"customerSignerName\":\"段祥东\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"6480.00\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"6480.00\",\"unWriteOffAmount\":\"6480.00\",\"unpaidAmount\":\"6480.00\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1642049699445579777\",\"projectName\":\"最新消息\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"南京钢铁股份有限公司-何伟聪\",\"customerId\":\"1684407610287136770\",\"customerName\":\"南京钢铁股份有限公司\",\"customerNature\":1,\"customerSignerName\":\"何伟聪\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"2563.22\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"2563.22\",\"unWriteOffAmount\":\"2563.22\",\"unpaidAmount\":\"2563.22\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1673583945056202754\",\"projectName\":\"万杰测试工程0627\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"南京钢铁股份有限公司-冯万杰\",\"customerId\":\"1673256468018573314\",\"customerName\":\"南京钢铁股份有限公司\",\"customerNature\":1,\"customerSignerName\":\"冯万杰\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"0.00\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"0.00\",\"unWriteOffAmount\":\"0.00\",\"unpaidAmount\":\"0.00\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"0.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1642049699445579777\",\"projectName\":\"最新消息\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"段祥东\",\"customerId\":\"1642049501398933506\",\"customerName\":\"段祥东\",\"customerNature\":2,\"customerSignerName\":\"段祥东\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"2558.00\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"2558.00\",\"unWriteOffAmount\":\"2558.00\",\"unpaidAmount\":\"2558.00\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1697541105772609537\",\"projectName\":\"丁想着0901录制\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"丁祥哲\",\"customerId\":\"1697496461858439169\",\"customerName\":\"丁祥哲\",\"customerNature\":2,\"customerSignerName\":\"丁祥哲\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"0.20\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"0.20\",\"unWriteOffAmount\":\"0.20\",\"unpaidAmount\":\"0.20\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1645362561763323906\",\"projectName\":\"物流工程\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"广州福耀玻璃有限公司-段祥东\",\"customerId\":\"1645365846943543298\",\"customerName\":\"广州福耀玻璃有限公司\",\"customerNature\":1,\"customerSignerName\":\"段祥东\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"1502.24\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"1502.24\",\"unWriteOffAmount\":\"1502.24\",\"unpaidAmount\":\"1502.24\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1656620315273584642\",\"projectName\":\"二级spu工程\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"南京钢铁股份有限公司-何伟聪\",\"customerId\":\"1684407610287136770\",\"customerName\":\"南京钢铁股份有限公司\",\"customerNature\":1,\"customerSignerName\":\"何伟聪\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"2711.55\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"2711.55\",\"unWriteOffAmount\":\"2711.55\",\"unpaidAmount\":\"2711.55\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1694676968011927553\",\"projectName\":\"测试问问\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"南京钢铁股份有限公司-何伟聪\",\"customerId\":\"1684407610287136770\",\"customerName\":\"南京钢铁股份有限公司\",\"customerNature\":1,\"customerSignerName\":\"何伟聪\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"1179.60\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"1179.60\",\"unWriteOffAmount\":\"1179.60\",\"unpaidAmount\":\"1179.60\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1663811973554655233\",\"projectName\":\"司机代交付0.5冒烟\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"广州恒大实业集团有限公司-段祥东\",\"customerId\":\"1644223310992961537\",\"customerName\":\"广州恒大实业集团有限公司\",\"customerNature\":1,\"customerSignerName\":\"段祥东\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"5558.66\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"5558.66\",\"unWriteOffAmount\":\"5558.66\",\"unpaidAmount\":\"5558.66\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1648286856837566465\",\"projectName\":\"小嘿工程\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"广州福耀玻璃有限公司-段祥东\",\"customerId\":\"1645365846943543298\",\"customerName\":\"广州福耀玻璃有限公司\",\"customerNature\":1,\"customerSignerName\":\"段祥东\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"82775.62\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"82775.62\",\"unWriteOffAmount\":\"82775.62\",\"unpaidAmount\":\"82775.62\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1642817331709837314\",\"projectName\":\"吕荣武工程\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"新疆广汇新能源有限公司-段祥东\",\"customerId\":\"1642818227583811585\",\"customerName\":\"新疆广汇新能源有限公司\",\"customerNature\":1,\"customerSignerName\":\"段祥东\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"179525.00\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"179525.00\",\"unWriteOffAmount\":\"179525.00\",\"unpaidAmount\":\"179525.00\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1642049699445579777\",\"projectName\":\"最新消息\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"广州恒大实业集团有限公司-段祥东\",\"customerId\":\"1644223310992961537\",\"customerName\":\"广州恒大实业集团有限公司\",\"customerNature\":1,\"customerSignerName\":\"段祥东\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"47370.00\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"47370.00\",\"unWriteOffAmount\":\"47370.00\",\"unpaidAmount\":\"47370.00\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1694910189191892994\",\"projectName\":\"小苏～拆借工程\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"段祥东\",\"customerId\":\"1642049501398933506\",\"customerName\":\"段祥东\",\"customerNature\":2,\"customerSignerName\":\"段祥东\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"920.00\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"920.00\",\"unWriteOffAmount\":\"920.00\",\"unpaidAmount\":\"920.00\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1673223151157207041\",\"projectName\":\"万杰测试工程0001\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"南京钢铁股份有限公司-冯万杰\",\"customerId\":\"1673256468018573314\",\"customerName\":\"南京钢铁股份有限公司\",\"customerNature\":1,\"customerSignerName\":\"冯万杰\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"10.00\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"10.00\",\"unWriteOffAmount\":\"10.00\",\"unpaidAmount\":\"10.00\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1642049699445579777\",\"projectName\":\"最新消息\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"新疆广汇新能源有限公司-段祥东\",\"customerId\":\"1642818227583811585\",\"customerName\":\"新疆广汇新能源有限公司\",\"customerNature\":1,\"customerSignerName\":\"段祥东\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"2000.00\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"2000.00\",\"unWriteOffAmount\":\"2000.00\",\"unpaidAmount\":\"2000.00\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1644262966002380801\",\"projectName\":\"测试工程新\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"南京钢铁股份有限公司-黄昱恒\",\"customerId\":\"1681539947826610177\",\"customerName\":\"南京钢铁股份有限公司\",\"customerNature\":1,\"customerSignerName\":\"黄昱恒\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"1054.00\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"1054.00\",\"unWriteOffAmount\":\"1054.00\",\"unpaidAmount\":\"1054.00\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1644262966002380801\",\"projectName\":\"测试工程新\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"段祥东\",\"customerId\":\"1642049501398933506\",\"customerName\":\"段祥东\",\"customerNature\":2,\"customerSignerName\":\"段祥东\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"8167.77\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"8167.77\",\"unWriteOffAmount\":\"8167.77\",\"unpaidAmount\":\"8167.77\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1644249580183154689\",\"projectName\":\"锁定库存工程\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"广州恒大实业集团有限公司-段祥东\",\"customerId\":\"1644223310992961537\",\"customerName\":\"广州恒大实业集团有限公司\",\"customerNature\":1,\"customerSignerName\":\"段祥东\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"31295.86\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"31295.86\",\"unWriteOffAmount\":\"31295.86\",\"unpaidAmount\":\"31295.86\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1688485935223955458\",\"projectName\":\"交付修改库存冒烟-吕荣武\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"广州恒大实业集团有限公司-段祥东\",\"customerId\":\"1644223310992961537\",\"customerName\":\"广州恒大实业集团有限公司\",\"customerNature\":1,\"customerSignerName\":\"段祥东\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"7623.36\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"7623.36\",\"unWriteOffAmount\":\"7623.36\",\"unpaidAmount\":\"7623.36\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"},{\"projectId\":\"1697514267714912257\",\"projectName\":\"丁祥哲项目0901-1\",\"lessor\":\"广州市时代物业管理有限公司-177系列门店销售BD\",\"lessee\":\"丁祥哲\",\"customerId\":\"1697496461858439169\",\"customerName\":\"丁祥哲\",\"customerNature\":2,\"customerSignerName\":\"丁祥哲\",\"customerSignerPhone\":null,\"customerBDId\":\"1642046449843265538\",\"customerBDName\":\"177系列门店销售BD\",\"merchantId\":\"1642042817390964738\",\"merchantName\":\"广州商户177专用商户\",\"merchantSignerName\":null,\"merchantSignerPhone\":null,\"merchantSignSubjectId\":\"1599008409929334785\",\"merchantSignSubjectName\":\"广州市时代物业管理有限公司\",\"storeId\":null,\"storeName\":null,\"totalAmount\":\"0.50\",\"receivedAmount\":\"0.00\",\"confirmedAmount\":\"0.00\",\"invoicedAmount\":\"0.00\",\"availableInvoiceAmount\":\"0.00\",\"amount2Pay\":\"0.50\",\"unWriteOffAmount\":\"0.50\",\"unpaidAmount\":\"0.50\",\"amountPaid\":\"0.00\",\"writtenOffAmount\":\"0.00\",\"projectBalance\":\"0.00\",\"totalReductionAmount\":\"0.00\",\"reductionPercentage\":\"0.00\",\"unpaidAmountPercentage\":\"100.00\",\"billBizIds\":null,\"feeConfirmationRate\":\"0.00\",\"dangerLevelDesc\":\"暂无风险\",\"overdueAmount\":\"0.00\",\"deadlineOverdueAmount\":\"0.00\"}],\"first\":true,\"last\":true,\"page\":\"1\",\"size\":\"100\",\"totalPages\":\"1\",\"totalElements\":\"31\"},\"traceId\":\"fc07a1ccafd344918c93a119d69cbc1e.152.16975102201321147\"}";
        JSONArray data = JSON.parseObject(a).getJSONObject("data").getJSONArray("records");
        BigDecimal total = BigDecimal.ZERO;
        for (int i=0;i<=data.size() -1;i++) {
            JSONObject jsonObject = data.getJSONObject(i);
            BigDecimal unpaidAmount = jsonObject.getBigDecimal("unpaidAmount");
            total = total.add(unpaidAmount);
        }
        System.out.println("data.size():"+data.size()+",total:"+total.toPlainString());


        List<Long> aa = null;
        Object a1 = aa;
        System.out.println((List<Long>) a1);
    }

}
