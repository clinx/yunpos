/*
 * *
 *  * 功能描述：
 *  * <p>
 *  * 版权所有：小牛信息科技有限公司
 *  * <p>
 *  * 未经本公司许可，不得以任何方式复制或使用本程序任何部分
 *  *
 *  * @author Bino Zhong 新增日期：${date}
 *  * @author Bino Zhong 修改日期：${date}
 *  *
 *
 */

package com.yunpos.rewriter.node;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * 功能描述：
 * <p>
 * 版权所有：小牛信息科技有限公司
 * <p>
 * 未经本公司许可，不得以任何方式复制或使用本程序任何部分
 *
 * @author bino 新增日期：2015/8/12
 * @author bino 修改日期：2015/8/12
 */
public class WhereClause implements NodeList{
    private String separator=" ";
    private List<Node> nodeList;
    public WhereClause(){
        nodeList=new ArrayList<>();
    }
    public String getText() {
        StringJoiner buf=new StringJoiner(separator);
        for(Node node:nodeList){
            buf.add(node.getText());
        }
        return buf.toString();
    }
    public void addNode(BaseNode node){
        nodeList.add(node);
    }

    @Override
    public void add(Node node) {
        nodeList.add(node);
    }

    @Override
    public int size() {
        return nodeList.size();
    }

    @Override
    public String getSeparator() {
        return separator;
    }

}
