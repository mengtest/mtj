/*     */ package com.nirvana.xml;
/*     */ 
/*     */ import scala.Tuple2;
/*     */ import scala.collection.immutable.List;
/*     */ import scala.reflect.ScalaSignature;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005-a\001B\001\003\001%\021a\002\025:p[>$XMU1uK\022+gM\003\002\004\t\005\031\0010\0347\013\005\0251\021a\0028jeZ\fg.\031\006\002\017\005\0311m\\7\004\001M\021\001A\003\t\003\0279i\021\001\004\006\002\033\005)1oY1mC&\021q\002\004\002\007\003:L(+\0324\t\013E\001A\021\001\n\002\rqJg.\033;?)\005\031\002C\001\013\001\033\005\021\001\"\003\f\001\001\004\005\r\021\"\001\030\003\tIG-F\001\031!\tY\021$\003\002\033\031\t\031\021J\034;\t\023q\001\001\031!a\001\n\003i\022AB5e?\022*\027\017\006\002\037CA\0211bH\005\003A1\021A!\0268ji\"9!eGA\001\002\004A\022a\001=%c!1A\005\001Q!\na\t1!\0333!\021%1\003\0011AA\002\023\005q#A\006qe>lw\016^3`Y\0264\b\"\003\025\001\001\004\005\r\021\"\001*\003=\001(o\\7pi\026|F.\032<`I\025\fHC\001\020+\021\035\021s%!AA\002aAa\001\f\001!B\023A\022\001\0049s_6|G/Z0mKZ\004\003\"\003\030\001\001\004\005\r\021\"\001\030\0035\tG\017\036:jEV$Xm\0309fe\"I\001\007\001a\001\002\004%\t!M\001\022CR$(/\0332vi\026|\006/\032:`I\025\fHC\001\0203\021\035\021s&!AA\002aAa\001\016\001!B\023A\022AD1uiJL'-\036;f?B,'\017\t\005\nm\001\001\r\0211A\005\002]\tAA]1uK\"I\001\b\001a\001\002\004%\t!O\001\te\006$Xm\030\023fcR\021aD\017\005\bE]\n\t\0211\001\031\021\031a\004\001)Q\0051\005)!/\031;fA!Ia\b\001a\001\002\004%\taF\001\016I><hn\0308qe>$Xm\031;\t\023\001\003\001\031!a\001\n\003\t\025!\0053po:|f\016\035:pi\026\034Go\030\023fcR\021aD\021\005\bE}\n\t\0211\001\031\021\031!\005\001)Q\0051\005qAm\\<o?:\004(o\034;fGR\004\003\"\003$\001\001\004\005\r\021\"\001\030\0031!wn\0368`aJ|G/Z2u\021%A\005\0011AA\002\023\005\021*\001\te_^tw\f\035:pi\026\034Go\030\023fcR\021aD\023\005\bE\035\013\t\0211\001\031\021\031a\005\001)Q\0051\005iAm\\<o?B\024x\016^3di\002B\021B\024\001A\002\003\007I\021A\f\002\025A\024x\016^3di~KG\rC\005Q\001\001\007\t\031!C\001#\006q\001O]8uK\016$x,\0333`I\025\fHC\001\020S\021\035\021s*!AA\002aAa\001\026\001!B\023A\022a\0039s_R,7\r^0jI\002B\021B\026\001A\002\003\007I\021A\f\002\0271,8m[=`Y\0264X\r\034\005\n1\002\001\r\0211A\005\002e\013q\002\\;dWf|F.\032<fY~#S-\035\013\003=iCqAI,\002\002\003\007\001\004\003\004]\001\001\006K\001G\001\rYV\0347._0mKZ,G\016\t\005\n=\002\001\r\0211A\005\002]\t1\002\\;dWf|F.[7ji\"I\001\r\001a\001\002\004%\t!Y\001\020YV\0347._0mS6LGo\030\023fcR\021aD\031\005\bE}\013\t\0211\001\031\021\031!\007\001)Q\0051\005aA.^2ls~c\027.\\5uA!Ia\r\001a\001\002\004%\taZ\001\raJ|Wn\034;f\023R,Wn]\013\002QB\031\021.\035;\017\005)|gBA6o\033\005a'BA7\t\003\031a$o\\8u}%\tQ\"\003\002q\031\0059\001/Y2lC\036,\027B\001:t\005\021a\025n\035;\013\005Ad\001\003B\006v1aI!A\036\007\003\rQ+\b\017\\33\021%A\b\0011AA\002\023\005\0210\001\tqe>lw\016^3Ji\026l7o\030\023fcR\021aD\037\005\bE]\f\t\0211\001i\021\031a\b\001)Q\005Q\006i\001O]8n_R,\027\n^3ng\002B\021B \001A\002\003\007I\021A\f\002\033A\024x.\\8uK~\003(/[2f\021-\t\t\001\001a\001\002\004%\t!a\001\002#A\024x.\\8uK~\003(/[2f?\022*\027\017F\002\037\003\013AqAI@\002\002\003\007\001\004C\004\002\n\001\001\013\025\002\r\002\035A\024x.\\8uK~\003(/[2fA\001")
/*     */ public class PromoteRateDef
/*     */ {
/*     */   private int id;
/*     */   private int promote_lev;
/*     */   private int attribute_per;
/*     */   private int rate;
/*     */   private int down_nprotect;
/*     */   private int down_protect;
/*     */   private int protect_id;
/*     */   private int lucky_level;
/*     */   private int lucky_limit;
/*     */   private List<Tuple2<Object, Object>> promoteItems;
/*     */   private int promote_price;
/*     */   
/*     */   public int id() {
/* 585 */     return this.id; } public void id_$eq(int x$1) { this.id = x$1; }
/* 586 */   public int promote_lev() { return this.promote_lev; } public void promote_lev_$eq(int x$1) { this.promote_lev = x$1; }
/* 587 */   public int attribute_per() { return this.attribute_per; } public void attribute_per_$eq(int x$1) { this.attribute_per = x$1; }
/* 588 */   public int rate() { return this.rate; } public void rate_$eq(int x$1) { this.rate = x$1; }
/* 589 */   public int down_nprotect() { return this.down_nprotect; } public void down_nprotect_$eq(int x$1) { this.down_nprotect = x$1; }
/* 590 */   public int down_protect() { return this.down_protect; } public void down_protect_$eq(int x$1) { this.down_protect = x$1; }
/* 591 */   public int protect_id() { return this.protect_id; } public void protect_id_$eq(int x$1) { this.protect_id = x$1; }
/* 592 */   public int lucky_level() { return this.lucky_level; } public void lucky_level_$eq(int x$1) { this.lucky_level = x$1; }
/* 593 */   public int lucky_limit() { return this.lucky_limit; } public void lucky_limit_$eq(int x$1) { this.lucky_limit = x$1; }
/* 594 */   public List<Tuple2<Object, Object>> promoteItems() { return this.promoteItems; } public void promoteItems_$eq(List<Tuple2<Object, Object>> x$1) { this.promoteItems = x$1; }
/* 595 */   public int promote_price() { return this.promote_price; } public void promote_price_$eq(int x$1) { this.promote_price = x$1; }
/*     */ 
/*     */ }


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\xml\PromoteRateDef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */