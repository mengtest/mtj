/*     */ package com.nirvana.xml;
/*     */ 
/*     */ import com.nirvana.bean.BaseAttr;
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
/*     */ @ScalaSignature(bytes = "\006\001\005ed\001B\001\003\001%\021!#R9vSBlWM\034;SK\032Lg.\032#fM*\0211\001B\001\004q6d'BA\003\007\003\035q\027N\035<b]\006T\021aB\001\004G>l7\001A\n\003\001)\001\"a\003\b\016\0031Q\021!D\001\006g\016\fG.Y\005\003\0371\021a!\0218z%\0264\007\"B\t\001\t\003\021\022A\002\037j]&$h\bF\001\024!\t!\002!D\001\003\021%1\002\0011AA\002\023\005q#\001\003lS:$W#\001\r\021\005-I\022B\001\016\r\005\rIe\016\036\005\n9\001\001\r\0211A\005\002u\t\001b[5oI~#S-\035\013\003=\005\002\"aC\020\n\005\001b!\001B+oSRDqAI\016\002\002\003\007\001$A\002yIEBa\001\n\001!B\023A\022!B6j]\022\004\003\"\003\024\001\001\004\005\r\021\"\001\030\003\031\031\027M]3fe\"I\001\006\001a\001\002\004%\t!K\001\013G\006\024X-\032:`I\025\fHC\001\020+\021\035\021s%!AA\002aAa\001\f\001!B\023A\022aB2be\026,'\017\t\005\n]\001\001\r\0211A\005\002]\t1\001\\3w\021%\001\004\0011AA\002\023\005\021'A\004mKZ|F%Z9\025\005y\021\004b\002\0220\003\003\005\r\001\007\005\007i\001\001\013\025\002\r\002\t1,g\017\t\005\nm\001\001\r\0211A\005\002]\t!B]3gS:,w\f\\3w\021%A\004\0011AA\002\023\005\021(\001\bsK\032Lg.Z0mKZ|F%Z9\025\005yQ\004b\002\0228\003\003\005\r\001\007\005\007y\001\001\013\025\002\r\002\027I,g-\0338f?2,g\017\t\005\n}\001\001\r\0211A\005\002}\n\021B\\3fI&#X-\\:\026\003\001\0032!Q%M\035\t\021uI\004\002D\r6\tAI\003\002F\021\0051AH]8pizJ\021!D\005\003\0212\tq\001]1dW\006<W-\003\002K\027\n!A*[:u\025\tAE\002\005\003\f\033bA\022B\001(\r\005\031!V\017\0357fe!I\001\013\001a\001\002\004%\t!U\001\016]\026,G-\023;f[N|F%Z9\025\005y\021\006b\002\022P\003\003\005\r\001\021\005\007)\002\001\013\025\002!\002\0259,W\rZ%uK6\034\b\005C\005W\001\001\007\t\031!C\001/\005Qa.Z3e?6|g.Z=\t\023a\003\001\031!a\001\n\003I\026A\0048fK\022|Vn\0348fs~#S-\035\013\003=iCqAI,\002\002\003\007\001\004\003\004]\001\001\006K\001G\001\f]\026,GmX7p]\026L\b\005C\005_\001\001\007\t\031!C\001/\0051\001\016]0nCbD\021\002\031\001A\002\003\007I\021A1\002\025!\004x,\\1y?\022*\027\017\006\002\037E\"9!eXA\001\002\004A\002B\0023\001A\003&\001$A\004ia~k\027\r\037\021\t\023\031\004\001\031!a\001\n\0039\022AB7q?6\f\007\020C\005i\001\001\007\t\031!C\001S\006QQ\016]0nCb|F%Z9\025\005yQ\007b\002\022h\003\003\005\r\001\007\005\007Y\002\001\013\025\002\r\002\0175\004x,\\1yA!Ia\016\001a\001\002\004%\taF\001\ba\"Lx,\031;u\021%\001\b\0011AA\002\023\005\021/A\006qQf|\026\r\036;`I\025\fHC\001\020s\021\035\021s.!AA\002aAa\001\036\001!B\023A\022\001\0039is~\013G\017\036\021\t\023Y\004\001\031!a\001\n\0039\022a\0029is~#WM\032\005\nq\002\001\r\0211A\005\002e\f1\002\0355z?\022,gm\030\023fcR\021aD\037\005\bE]\f\t\0211\001\031\021\031a\b\001)Q\0051\005A\001\017[=`I\0264\007\005C\005\001\001\007\t\031!C\001/\005\031\001.\033;\t\027\005\005\001\0011AA\002\023\005\0211A\001\bQ&$x\fJ3r)\rq\022Q\001\005\bE}\f\t\0211\001\031\021\035\tI\001\001Q!\na\tA\001[5uA!Q\021Q\002\001A\002\003\007I\021A\f\002\007\0254\030\rC\006\002\022\001\001\r\0211A\005\002\005M\021aB3wC~#S-\035\013\004=\005U\001\002\003\022\002\020\005\005\t\031\001\r\t\017\005e\001\001)Q\0051\005!QM^1!\021)\ti\002\001a\001\002\004%\taF\001\005GJLG\017C\006\002\"\001\001\r\0211A\005\002\005\r\022\001C2sSR|F%Z9\025\007y\t)\003\003\005#\003?\t\t\0211\001\031\021\035\tI\003\001Q!\na\tQa\031:ji\002B!\"!\f\001\001\004\005\r\021\"\001\030\003\025!x.^4i\021-\t\t\004\001a\001\002\004%\t!a\r\002\023Q|Wo\0325`I\025\fHc\001\020\0026!A!%a\f\002\002\003\007\001\004C\004\002:\001\001\013\025\002\r\002\rQ|Wo\0325!\021)\ti\004\001a\001\002\004%\taF\001\006M\006$\030\r\034\005\f\003\003\002\001\031!a\001\n\003\t\031%A\005gCR\fGn\030\023fcR\031a$!\022\t\021\t\ny$!AA\002aAq!!\023\001A\003&\001$\001\004gCR\fG\016\t\005\013\003\033\002\001\031!a\001\n\0039\022!\0022m_\016\\\007bCA)\001\001\007\t\031!C\001\003'\n\021B\0317pG.|F%Z9\025\007y\t)\006\003\005#\003\037\n\t\0211\001\031\021\035\tI\006\001Q!\na\taA\0317pG.\004\003bCA/\001\001\007\t\031!C\001\003?\n\001BY1tK\006#HO]\013\003\003C\002B!a\031\002j5\021\021Q\r\006\004\003O\"\021\001\0022fC:LA!a\033\002f\tA!)Y:f\003R$(\017C\006\002p\001\001\r\0211A\005\002\005E\024\001\0042bg\026\fE\017\036:`I\025\fHc\001\020\002t!I!%!\034\002\002\003\007\021\021\r\005\t\003o\002\001\025)\003\002b\005I!-Y:f\003R$(\017\t")
/*     */ public class EquipmentRefineDef
/*     */ {
/*     */   private int kind;
/*     */   private int career;
/*     */   private int lev;
/*     */   private int refine_lev;
/*     */   private List<Tuple2<Object, Object>> needItems;
/*     */   private int need_money;
/*     */   private int hp_max;
/*     */   private int mp_max;
/*     */   private int phy_att;
/*     */   private int phy_def;
/*     */   private int hit;
/*     */   private int eva;
/*     */   private int crit;
/*     */   private int tough;
/*     */   private int fatal;
/*     */   private int block;
/*     */   private BaseAttr baseAttr;
/*     */   
/*     */   public int kind() {
/* 483 */     return this.kind; } public void kind_$eq(int x$1) { this.kind = x$1; }
/* 484 */   public int career() { return this.career; } public void career_$eq(int x$1) { this.career = x$1; }
/* 485 */   public int lev() { return this.lev; } public void lev_$eq(int x$1) { this.lev = x$1; }
/* 486 */   public int refine_lev() { return this.refine_lev; } public void refine_lev_$eq(int x$1) { this.refine_lev = x$1; }
/* 487 */   public List<Tuple2<Object, Object>> needItems() { return this.needItems; } public void needItems_$eq(List<Tuple2<Object, Object>> x$1) { this.needItems = x$1; }
/* 488 */   public int need_money() { return this.need_money; } public void need_money_$eq(int x$1) { this.need_money = x$1; }
/* 489 */   public int hp_max() { return this.hp_max; } public void hp_max_$eq(int x$1) { this.hp_max = x$1; }
/* 490 */   public int mp_max() { return this.mp_max; } public void mp_max_$eq(int x$1) { this.mp_max = x$1; }
/* 491 */   public int phy_att() { return this.phy_att; } public void phy_att_$eq(int x$1) { this.phy_att = x$1; }
/* 492 */   public int phy_def() { return this.phy_def; } public void phy_def_$eq(int x$1) { this.phy_def = x$1; }
/* 493 */   public int hit() { return this.hit; } public void hit_$eq(int x$1) { this.hit = x$1; }
/* 494 */   public int eva() { return this.eva; } public void eva_$eq(int x$1) { this.eva = x$1; }
/* 495 */   public int crit() { return this.crit; } public void crit_$eq(int x$1) { this.crit = x$1; }
/* 496 */   public int tough() { return this.tough; } public void tough_$eq(int x$1) { this.tough = x$1; }
/* 497 */   public int fatal() { return this.fatal; } public void fatal_$eq(int x$1) { this.fatal = x$1; }
/* 498 */   public int block() { return this.block; } public void block_$eq(int x$1) { this.block = x$1; }
/* 499 */   public BaseAttr baseAttr() { return this.baseAttr; } public void baseAttr_$eq(BaseAttr x$1) { this.baseAttr = x$1; }
/*     */ 
/*     */ }


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\xml\EquipmentRefineDef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */