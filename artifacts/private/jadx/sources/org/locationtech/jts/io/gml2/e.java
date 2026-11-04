package org.locationtech.jts.io.gml2;

import com.devtodev.analytics.internal.domain.events.TrackingStatusKt;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import org.locationtech.jts.geom.a0;
import org.locationtech.jts.geom.b0;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.x;
import org.locationtech.jts.geom.z;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes14.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap f338525a = c();

    class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakHashMap f338526a = new WeakHashMap();

        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.locationtech.jts.io.gml2.e.n
        public Object a(org.locationtech.jts.io.gml2.b.a aVar, r rVar) throws SAXException {
            Pattern pattern;
            StringBuffer stringBuffer = aVar.f338512c;
            if (stringBuffer != null) {
                String str = "";
                if (!"".equals(stringBuffer)) {
                    String value = aVar.f338510a.getIndex("decimal") >= 0 ? aVar.f338510a.getValue("decimal") : aVar.f338510a.getIndex(org.locationtech.jts.io.gml2.a.f338483a, "decimal") >= 0 ? aVar.f338510a.getValue(org.locationtech.jts.io.gml2.a.f338483a, "decimal") : ".";
                    String value2 = aVar.f338510a.getIndex("cs") >= 0 ? aVar.f338510a.getValue("cs") : aVar.f338510a.getIndex(org.locationtech.jts.io.gml2.a.f338483a, "cs") >= 0 ? aVar.f338510a.getValue(org.locationtech.jts.io.gml2.a.f338483a, "cs") : ",";
                    String value3 = aVar.f338510a.getIndex(TrackingStatusKt.TRACKING_CODE) >= 0 ? aVar.f338510a.getValue(TrackingStatusKt.TRACKING_CODE) : aVar.f338510a.getIndex(org.locationtech.jts.io.gml2.a.f338483a, TrackingStatusKt.TRACKING_CODE) >= 0 ? aVar.f338510a.getValue(org.locationtech.jts.io.gml2.a.f338483a, TrackingStatusKt.TRACKING_CODE) : " ";
                    String strReplaceAll = aVar.f338512c.toString().replaceAll("\\s", " ");
                    Pattern patternCompile = (Pattern) this.f338526a.get(value3);
                    String str2 = "\\\\";
                    int i10 = 92;
                    if (patternCompile == null) {
                        String str3 = new String(value3);
                        if (str3.indexOf(92) > -1) {
                            str3 = str3.replaceAll("\\", "\\\\");
                        }
                        if (str3.indexOf(46) > -1) {
                            str3 = str3.replaceAll("\\.", "\\\\.");
                        }
                        patternCompile = Pattern.compile(str3);
                        this.f338526a.put(value3, patternCompile);
                    }
                    String[] strArrSplit = patternCompile.split(strReplaceAll.trim());
                    if (strArrSplit.length == 0) {
                        throw new SAXException("Cannot create a coordinate sequence without a touple to parse");
                    }
                    int i11 = 0;
                    for (int i12 = 0; i12 < strArrSplit.length; i12++) {
                        String str4 = strArrSplit[i12];
                        if (str4 != null && !"".equals(str4.trim())) {
                            if (i12 != i11) {
                                strArrSplit[i11] = strArrSplit[i12];
                            }
                            i11++;
                        }
                    }
                    for (int i13 = i11; i13 < strArrSplit.length; i13++) {
                        strArrSplit[i13] = null;
                    }
                    if (i11 == 0) {
                        throw new SAXException("Cannot create a coordinate sequence without a non-null touple to parse");
                    }
                    org.locationtech.jts.geom.e eVarC = rVar.D().c(i11, org.locationtech.jts.util.m.e(strArrSplit[0], value2).length);
                    int iRg = eVarC.Rg();
                    boolean zEquals = ".".equals(value);
                    int i14 = 0;
                    while (i14 < i11) {
                        Pattern pattern2 = (Pattern) this.f338526a.get(value2);
                        if (pattern2 == null) {
                            String str5 = new String(value2);
                            if (str5.indexOf(i10) > -1) {
                                str5 = str5.replaceAll("\\", str2);
                            }
                            if (str5.indexOf(46) > -1) {
                                str5 = str5.replaceAll("\\.", "\\\\.");
                            }
                            Pattern patternCompile2 = Pattern.compile(str5);
                            this.f338526a.put(value2, patternCompile2);
                            pattern = patternCompile2;
                        } else {
                            pattern = pattern2;
                        }
                        String[] strArrSplit2 = pattern.split(strArrSplit[i14]);
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < strArrSplit2.length && i16 < iRg) {
                            String str6 = strArrSplit2[i16];
                            if (str6 != null && !str.equals(str6.trim())) {
                                eVarC.Ld(i14, i15, Double.parseDouble(!zEquals ? strArrSplit2[i16].replaceAll(value, ".") : strArrSplit2[i16]));
                                i15++;
                            }
                            i16++;
                            str = str;
                            value = value;
                        }
                        String str7 = value;
                        String str8 = str;
                        while (i15 < iRg) {
                            eVarC.Ld(i14, i15, Double.NaN);
                            i15++;
                        }
                        i14++;
                        str2 = str2;
                        strArrSplit = strArrSplit;
                        str = str8;
                        value = str7;
                        i10 = 92;
                    }
                    return eVarC;
                }
            }
            throw new SAXException("Cannot create a coordinate sequence without text to parse");
        }
    }

    class b implements n {
        b() {
        }

        @Override // org.locationtech.jts.io.gml2.e.n
        public Object a(org.locationtech.jts.io.gml2.b.a aVar, r rVar) throws SAXException {
            if (aVar.f338513d.size() < 1) {
                throw new SAXException("Cannot create a coordinate without atleast one axis");
            }
            if (aVar.f338513d.size() > 3) {
                throw new SAXException("Cannot create a coordinate with more than 3 axis");
            }
            List list = aVar.f338513d;
            Double[] dArr = (Double[]) list.toArray(new Double[list.size()]);
            org.locationtech.jts.geom.a aVar2 = new org.locationtech.jts.geom.a();
            aVar2.f338092a = dArr[0].doubleValue();
            if (dArr.length > 1) {
                aVar2.f338093b = dArr[1].doubleValue();
            }
            if (dArr.length > 2) {
                aVar2.f338094c = dArr[2].doubleValue();
            }
            return aVar2;
        }
    }

    class c implements n {
        c() {
        }

        @Override // org.locationtech.jts.io.gml2.e.n
        public Object a(org.locationtech.jts.io.gml2.b.a aVar, r rVar) throws SAXException {
            StringBuffer stringBuffer = aVar.f338512c;
            if (stringBuffer == null) {
                return null;
            }
            return new Double(stringBuffer.toString());
        }
    }

    class d implements n {
        d() {
        }

        @Override // org.locationtech.jts.io.gml2.e.n
        public Object a(org.locationtech.jts.io.gml2.b.a aVar, r rVar) throws SAXException {
            if (aVar.f338513d.size() == 1) {
                return aVar.f338513d.get(0);
            }
            throw new SAXException("Geometry Members may only contain one geometry.");
        }
    }

    /* JADX INFO: renamed from: org.locationtech.jts.io.gml2.e$e, reason: collision with other inner class name */
    class C2425e implements n {
        C2425e() {
        }

        @Override // org.locationtech.jts.io.gml2.e.n
        public Object a(org.locationtech.jts.io.gml2.b.a aVar, r rVar) throws SAXException {
            if (aVar.f338513d.size() != 1) {
                throw new SAXException("Cannot create a point without exactly one coordinate");
            }
            int iB = e.b(aVar.f338510a, rVar.G());
            int i10 = 2 >> 0;
            Object obj = aVar.f338513d.get(0);
            d0 d0VarV = obj instanceof org.locationtech.jts.geom.a ? rVar.v((org.locationtech.jts.geom.a) obj) : rVar.w((org.locationtech.jts.geom.e) obj);
            if (d0VarV.o0() != iB) {
                d0VarV.I0(iB);
            }
            return d0VarV;
        }
    }

    class f implements n {
        f() {
        }

        @Override // org.locationtech.jts.io.gml2.e.n
        public Object a(org.locationtech.jts.io.gml2.b.a aVar, r rVar) throws SAXException {
            v vVarH;
            if (aVar.f338513d.size() < 1) {
                throw new SAXException("Cannot create a linestring without atleast two coordinates or one coordinate sequence");
            }
            int iB = e.b(aVar.f338510a, rVar.G());
            if (aVar.f338513d.size() == 1) {
                try {
                    vVarH = rVar.g((org.locationtech.jts.geom.e) aVar.f338513d.get(0));
                } catch (ClassCastException e10) {
                    throw new SAXException("Cannot create a linestring without atleast two coordinates or one coordinate sequence", e10);
                }
            } else {
                try {
                    List list = aVar.f338513d;
                    vVarH = rVar.h((org.locationtech.jts.geom.a[]) list.toArray(new org.locationtech.jts.geom.a[list.size()]));
                } catch (ClassCastException e11) {
                    throw new SAXException("Cannot create a linestring without atleast two coordinates or one coordinate sequence", e11);
                }
            }
            if (vVarH.o0() != iB) {
                vVarH.I0(iB);
            }
            return vVarH;
        }
    }

    class g implements n {
        g() {
        }

        @Override // org.locationtech.jts.io.gml2.e.n
        public Object a(org.locationtech.jts.io.gml2.b.a aVar, r rVar) throws SAXException {
            x xVarK;
            if (aVar.f338513d.size() != 1 && aVar.f338513d.size() < 4) {
                throw new SAXException("Cannot create a linear ring without atleast four coordinates or one coordinate sequence");
            }
            int iB = e.b(aVar.f338510a, rVar.G());
            if (aVar.f338513d.size() == 1) {
                try {
                    xVarK = rVar.j((org.locationtech.jts.geom.e) aVar.f338513d.get(0));
                } catch (ClassCastException e10) {
                    throw new SAXException("Cannot create a linear ring without atleast four coordinates or one coordinate sequence", e10);
                }
            } else {
                try {
                    List list = aVar.f338513d;
                    xVarK = rVar.k((org.locationtech.jts.geom.a[]) list.toArray(new org.locationtech.jts.geom.a[list.size()]));
                } catch (ClassCastException e11) {
                    throw new SAXException("Cannot create a linear ring without atleast four coordinates or one coordinate sequence", e11);
                }
            }
            if (xVarK.o0() != iB) {
                xVarK.I0(iB);
            }
            return xVarK;
        }
    }

    class h implements n {
        h() {
        }

        @Override // org.locationtech.jts.io.gml2.e.n
        public Object a(org.locationtech.jts.io.gml2.b.a aVar, r rVar) throws SAXException {
            List listSubList;
            if (aVar.f338513d.size() < 1) {
                throw new SAXException("Cannot create a polygon without atleast one linear ring");
            }
            int iB = e.b(aVar.f338510a, rVar.G());
            x xVar = (x) aVar.f338513d.get(0);
            x[] xVarArr = null;
            if (aVar.f338513d.size() > 1) {
                List list = aVar.f338513d;
                listSubList = list.subList(1, list.size());
            } else {
                listSubList = null;
            }
            if (listSubList != null) {
                xVarArr = (x[]) listSubList.toArray(new x[listSubList.size()]);
            }
            e0 e0VarB = rVar.B(xVar, xVarArr);
            if (e0VarB.o0() != iB) {
                e0VarB.I0(iB);
            }
            return e0VarB;
        }
    }

    class i implements n {
        i() {
        }

        @Override // org.locationtech.jts.io.gml2.e.n
        public Object a(org.locationtech.jts.io.gml2.b.a aVar, r rVar) throws SAXException {
            if (aVar.f338513d.size() < 1 || aVar.f338513d.size() > 2) {
                throw new SAXException("Cannot create a box without either two coords or one coordinate sequence");
            }
            return aVar.f338513d.size() == 1 ? ((org.locationtech.jts.geom.e) aVar.f338513d.get(0)).Ij(new org.locationtech.jts.geom.m()) : new org.locationtech.jts.geom.m((org.locationtech.jts.geom.a) aVar.f338513d.get(0), (org.locationtech.jts.geom.a) aVar.f338513d.get(1));
        }
    }

    class j implements n {
        j() {
        }

        @Override // org.locationtech.jts.io.gml2.e.n
        public Object a(org.locationtech.jts.io.gml2.b.a aVar, r rVar) throws SAXException {
            if (aVar.f338513d.size() < 1) {
                throw new SAXException("Cannot create a multi-point without atleast one point");
            }
            int iB = e.b(aVar.f338510a, rVar.G());
            List list = aVar.f338513d;
            a0 a0VarQ = rVar.q((d0[]) list.toArray(new d0[list.size()]));
            if (a0VarQ.o0() != iB) {
                a0VarQ.I0(iB);
            }
            return a0VarQ;
        }
    }

    class k implements n {
        k() {
        }

        @Override // org.locationtech.jts.io.gml2.e.n
        public Object a(org.locationtech.jts.io.gml2.b.a aVar, r rVar) throws SAXException {
            if (aVar.f338513d.size() < 1) {
                throw new SAXException("Cannot create a multi-linestring without atleast one linestring");
            }
            int iB = e.b(aVar.f338510a, rVar.G());
            List list = aVar.f338513d;
            z zVarM = rVar.m((v[]) list.toArray(new v[list.size()]));
            if (zVarM.o0() != iB) {
                zVarM.I0(iB);
            }
            return zVarM;
        }
    }

    class l implements n {
        l() {
        }

        @Override // org.locationtech.jts.io.gml2.e.n
        public Object a(org.locationtech.jts.io.gml2.b.a aVar, r rVar) throws SAXException {
            if (aVar.f338513d.size() < 1) {
                throw new SAXException("Cannot create a multi-polygon without atleast one polygon");
            }
            int iB = e.b(aVar.f338510a, rVar.G());
            List list = aVar.f338513d;
            b0 b0VarT = rVar.t((e0[]) list.toArray(new e0[list.size()]));
            if (b0VarT.o0() != iB) {
                b0VarT.I0(iB);
            }
            return b0VarT;
        }
    }

    class m implements n {
        m() {
        }

        @Override // org.locationtech.jts.io.gml2.e.n
        public Object a(org.locationtech.jts.io.gml2.b.a aVar, r rVar) throws SAXException {
            if (aVar.f338513d.size() < 1) {
                throw new SAXException("Cannot create a multi-polygon without atleast one geometry");
            }
            List list = aVar.f338513d;
            return rVar.e((org.locationtech.jts.geom.n[]) list.toArray(new org.locationtech.jts.geom.n[list.size()]));
        }
    }

    interface n {
        Object a(org.locationtech.jts.io.gml2.b.a aVar, r rVar) throws SAXException;
    }

    public static n a(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        return (n) f338525a.get(str2.toLowerCase());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r4 = r4.trim();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int b(org.xml.sax.Attributes r4, int r5) {
        /*
            java.lang.String r0 = "essrNms"
            java.lang.String r0 = "srsName"
            int r1 = r4.getIndex(r0)
            if (r1 < 0) goto Lf
            java.lang.String r4 = r4.getValue(r0)
            goto L1f
        Lf:
            java.lang.String r1 = "http://www.opengis.net/gml"
            r3 = 2
            int r2 = r4.getIndex(r1, r0)
            if (r2 < 0) goto L1d
            java.lang.String r4 = r4.getValue(r1, r0)
            goto L1f
        L1d:
            r3 = 3
            r4 = 0
        L1f:
            if (r4 == 0) goto L4c
            java.lang.String r4 = r4.trim()
            r3 = 2
            if (r4 == 0) goto L4c
            java.lang.String r0 = ""
            r3 = 5
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L4c
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L37
            r3 = 0
            return r4
        L37:
            r0 = 35
            int r0 = r4.lastIndexOf(r0)
            r3 = 5
            r1 = -1
            r3 = 1
            if (r0 <= r1) goto L46
            java.lang.String r4 = r4.substring(r0)
        L46:
            r3 = 7
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L4c
            return r4
        L4c:
            r3 = 5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.locationtech.jts.io.gml2.e.b(org.xml.sax.Attributes, int):int");
    }

    private static HashMap c() {
        HashMap map = new HashMap();
        map.put(org.locationtech.jts.io.gml2.a.f338492j.toLowerCase(), new C2425e());
        map.put(org.locationtech.jts.io.gml2.a.f338493k.toLowerCase(), new f());
        map.put(org.locationtech.jts.io.gml2.a.f338494l.toLowerCase(), new g());
        map.put(org.locationtech.jts.io.gml2.a.f338495m.toLowerCase(), new h());
        map.put(org.locationtech.jts.io.gml2.a.f338496n.toLowerCase(), new i());
        map.put(org.locationtech.jts.io.gml2.a.f338498p.toLowerCase(), new j());
        map.put(org.locationtech.jts.io.gml2.a.f338499q.toLowerCase(), new k());
        map.put(org.locationtech.jts.io.gml2.a.f338500r.toLowerCase(), new l());
        map.put(org.locationtech.jts.io.gml2.a.f338497o.toLowerCase(), new m());
        map.put(org.locationtech.jts.io.gml2.a.f338501s.toLowerCase(), new a());
        map.put(org.locationtech.jts.io.gml2.a.f338502t.toLowerCase(), new b());
        c cVar = new c();
        map.put(org.locationtech.jts.io.gml2.a.f338503u.toLowerCase(), cVar);
        map.put(org.locationtech.jts.io.gml2.a.f338504v.toLowerCase(), cVar);
        map.put(org.locationtech.jts.io.gml2.a.f338505w.toLowerCase(), cVar);
        d dVar = new d();
        map.put(org.locationtech.jts.io.gml2.a.f338490h.toLowerCase(), dVar);
        map.put(org.locationtech.jts.io.gml2.a.f338491i.toLowerCase(), dVar);
        map.put(org.locationtech.jts.io.gml2.a.f338487e.toLowerCase(), dVar);
        map.put(org.locationtech.jts.io.gml2.a.f338489g.toLowerCase(), dVar);
        map.put(org.locationtech.jts.io.gml2.a.f338488f.toLowerCase(), dVar);
        return map;
    }
}
