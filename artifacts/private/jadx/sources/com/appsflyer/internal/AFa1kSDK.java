package com.appsflyer.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class AFa1kSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    public static final Map AFInAppEventType;
    private static int afDebugLog;
    private static int afErrorLog;
    private static long afInfoLog;
    private static int afLogForce;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Object f89661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static byte[] f89662e;
    private static long force;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map f89663i;
    private static byte[] unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static long f89664v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static Object f89665w;

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    /* JADX WARN: Code duplicated, block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0037 -> B:11:0x0049). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0037
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(short r8, int r9, int r10) {
        /*
            java.lang.String r7 = "Androeed.ru"
            int r8 = 1158 - r8
            r7 = 6
            int r9 = r9 + 33
            byte[] r0 = com.appsflyer.internal.AFa1kSDK.$$a
            int r10 = r10 + 1
            byte[] r1 = new byte[r10]
            r2 = 5
            r2 = 0
            if (r0 != 0) goto L21
            int r3 = com.appsflyer.internal.AFa1kSDK.$12
            r7 = 4
            int r3 = r3 + 15
            int r3 = r3 % 128
            r7 = 2
            com.appsflyer.internal.AFa1kSDK.$13 = r3
            r7 = 6
            r4 = r9
            r7 = 7
            r3 = r2
            r9 = r8
            goto L49
        L21:
            r7 = 2
            r3 = r9
            r3 = r9
            r9 = r8
            r8 = r3
            r3 = r2
        L27:
            byte r4 = (byte) r8
            r7 = 3
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r10) goto L37
            r7 = 2
            java.lang.String r8 = new java.lang.String
            r7 = 3
            r8.<init>(r1, r2)
            return r8
        L37:
            r7 = 3
            r4 = r0[r9]
            r7 = 4
            int r5 = com.appsflyer.internal.AFa1kSDK.$12
            r7 = 6
            int r5 = r5 + 33
            int r5 = r5 % 128
            com.appsflyer.internal.AFa1kSDK.$13 = r5
            r6 = r9
            r6 = r9
            r9 = r8
            r8 = r6
            r8 = r6
        L49:
            r7 = 1
            int r8 = r8 + 1
            r7 = 1
            int r9 = r9 + r4
            int r9 = r9 + (-1)
            r7 = 2
            r6 = r9
            r6 = r9
            r9 = r8
            r9 = r8
            r8 = r6
            r8 = r6
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1kSDK.$$c(short, int, int):java.lang.String");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 79421. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    static {
        /*
            Method dump skipped, instruction units count: 7942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1kSDK.<clinit>():void");
    }

    private AFa1kSDK() {
    }

    public static Object getCurrencyIso4217Code(int i10, char c10, int i11) throws Throwable {
        int i12 = $10;
        int i13 = (i12 & 13) + (i12 | 13);
        $11 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        Object obj = f89661d;
        int i14 = (i12 + 13) % 128;
        $11 = i14;
        $10 = ((i14 & 93) + (i14 | 93)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i10), Character.valueOf(c10), Integer.valueOf(i11)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c((short) 590, bArr[264], bArr[634]), true, (ClassLoader) f89665w);
            byte b10 = bArr[85];
            String str$$c = $$c(b10, bArr[564], b10);
            Class cls2 = Integer.TYPE;
            Object objInvoke = cls.getMethod(str$$c, cls2, Character.TYPE, cls2).invoke(obj, objArr);
            int i15 = $10;
            $11 = ((i15 & 25) + (i15 | 25)) % 128;
            return objInvoke;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static int getMediationNetwork(Object obj) throws Throwable {
        int i10 = $10;
        Object obj2 = f89661d;
        $11 = (((i10 | 49) << 1) - (i10 ^ 49)) % 128;
        try {
            byte[] bArr = $$a;
            int iIntValue = ((Integer) Class.forName($$c((short) 590, bArr[264], bArr[634]), true, (ClassLoader) f89665w).getMethod($$c(bArr[113], bArr[634], bArr[4]), Object.class).invoke(obj2, obj)).intValue();
            $11 = ($10 + 51) % 128;
            return iIntValue;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static int getMonetizationNetwork(int i10) throws Throwable {
        int i11 = $10;
        int i12 = 1 << 1;
        int i13 = (((i11 | 91) << 1) - (i11 ^ 91)) % 128;
        $11 = i13;
        Object obj = f89661d;
        $10 = (i13 + 97) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i10)};
            byte[] bArr = $$a;
            int iIntValue = ((Integer) Class.forName($$c((short) 590, bArr[264], bArr[634]), true, (ClassLoader) f89665w).getMethod($$c((short) 558, bArr[564], bArr[92]), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i14 = $11;
            int i15 = (i14 & 87) + (i14 | 87);
            $10 = i15 % 128;
            if (i15 % 2 == 0) {
                return iIntValue;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    static void init$0() {
        $11 = ($10 + 71) % 128;
        byte[] bArr = new byte[1172];
        System.arraycopy("e×!'\u000e÷\u000fþûüË:\fð\u0010ù\u0002û\u0011¼\u0016-þ\u0004\u0004\u000b\nñ\rÿÃ3\u0010\u0001\u0004ô\u0007\u000eí\u000e¾;\u0006\u0007ò\u000eýô\fÄ\u0013\u0006\u001dÐIÛò\b\t\u0001\rÿÂ4\u0010\u0001\u0004ô\u0007\u000eí\u000e\u000e÷\u000fþûüË4\u0010\u0001¿\u0014#\u0012ö\u000eô\f\u0006Ü\u0015\u000bôý\u0004\u0013þ\u0001ô\n\u0007Î0\u0001ýþûÿ\u0014ö\u0007\u0000\u000e÷\u000fþûüË4\u0010\u0001¿\u00140\u0001Ø&\u0004ô\u0000\f\bÿ\u0010Ö&ü\föù\fÖ0\u0001ýþûÿ\u0014ö\u0007\u0000ÿ\u0010Ó$\u0004ú\u000fÒ&\nÿ\u0010Ð-ö\u0002ß\u001f\u0003\u0006þà&\nÿ\u0010Ð\u001f\u0003\u0006þà&\n6þ\u0014îÏ6þ\u0014îÏø\u0016ìÎ<\u0007À\u0019$\u0004úø\u0016ìÎ<\u0007ÀGú\u0004õ\u0006\nø\u0016ìÎ?ö\u000eúÈ&'û\u0002ò\tÿ\u0010Ý#þ\u0002ö\u000e\u0003\u0006\rö\u0002û\u0005ÿ\u0003\u0006þ\u000e÷\u000fþûüËB\u0005¼\u00154õ\u0004ùÁ3ð\u000e\u0002÷\u0007\u0000ò\b\u0015ë\u0006\u0007ÿ\u000eê\u001cø\fòì\u0007ë\tø\u0016ìÎ<\u0007À\u001c\u0007÷4ì\u0003\f\u0005ö\u0007\u0000\u0013þ\u0001ô\n\u0007á\u0016\u0005ùé\u001d\u0004\u0001þ\u000bø\u0016ìÎ<\u0007À\u0019$\u0004úë'\u0000ý\u0006\u0000à\"ÿôý\r\n\u0004\u0005óì\u0004î\t3\u0013\u0001ó\u0010\u0000½5\rÿÃ3\u0010\u0001\u0004ô\u0007\u000eí\u000e¾;\u0006\u0007ò\u000eýô\fÄ\u0006þ5Ï\u0006\u0001-\u0003Ë3Ñ5Ó\u0001\u0002\u0000*Íÿ\u0010ß\u0014\u000fý\u0007þò\u0003ø\u0016ìÎAø\u0010»(þûÿ\u0010Ý\u0012\u0014õø\u0016ìÎ<\u0007À\u00154ò\u0001\u0000\u000eô\u0000æ&\u0003\u0006\u0000à\"ÿôý\rø\u0016ìÎ<\u0007À\u001c&\u0003\u0006\u0000à\"ÿôý\rø\u0016ìÎ<\u0007À\u0017\u001e\u0014îé&\u0003\u0006\u0000à\"ÿôý\rôý\u0004ã0ø\u0001\u000eø\u0016ìÎ<\u0007À\u00158üòÝ2\u0001ð\u0019Ñ&\u0003\u0006\u0000à\"ÿôý\r\rÿÂ4\u0010\u0001\u0004ô\u0007\u000eí\u000e½<\u0006\u0007ò\u000eýô\fÃ\u0014\u0006&ÇFÞò\b\rÿÂ4\u0010\u0001\u0004ô\u0007\u000eí\u000e½<\u0006\u0007ò\u000eýô\fÃ\u0014\u0006\u001dÐIÛò\b\t\u0001ÿ\u0010Ð3þ\u0001ô\nö\u0017Ñ+ýÆÿ\u0000\u0007\r-ö\u0002ùÿ\bôý\u0004ó\u0010ß\u0014ý\u0004ì ÿ\u000eì\u0005í\tüø\fòÿ\u0010Óÿø\u0016ìÎ<\u0007À\u0019$\u0004úà\"\u000fñ\u0010ø\b\u0005ü\u0004\u0007ööþ\f\u000bô\u0003ÄF\u0007û\u0002ò\tÂ\u0017\"\u0014Ï$\u0004ú\u0004ó\u0004á\"\u0014ÿ\u0010Î\"\u0012ýþ\n\u0000òì\u0012\u0014õ\u0002\bú\u0010òÿ\u0010Ð*ö\u0013\u0001Ú$ó\u0004\u0002\u000eø\u0016ìÎH\u0000ö\u0004ÃMð\b¿-\u0010\bÚ&\u0003\u0006\u0000à\"ÿôý\rÿ\u0010Û\u0018\u0014ýÒ*\u0007ÿ\bø\u0016ìÎH\u0000ö\u0004ÃMð\b¿-\u0010\bÖ*\u0007ÿ\bÿ\u0010à\u0017\u0012ìø\u0016ìÎ<\u0007À\u00158üòÝ2\u0001ð\u0019×'\u0000ý\u0006\u0000à\"ÿôý\rüÔ8üòÝ2\u0001ð\u0019ø\u0016ìÎ<\u0007À\u0016*\u0004\u0005óý\u0002\u000búþ\f\u000bô\u0003ÄF\u0007û\u0002ò\tÂ\u001c&à\u0019\t\u0003\u0004\bÌ\"\u0014Ì*ö\u0013\u0001Ú$ó\u0004\u0002\u000eø\u0016ìÎAü\u0007À\u00158üòÞ4ò\u0001\u0000\u000eø\u0016ìÎ?ö\u000eúÈ\u0016*ö\u0013\u0001Ú$ó\u0004\u0002\u000eüð\u0010þ\f\u000bô\u0003ÄF\u0007û\u0002ò\tÂ\u0015 \u0013óà\"\u0014Ì*ö\u0013\u0001Ú$ó\u0004\u0002\u000eò\u0014õå\u001e\u000b\u0002ô\u0014ö\u000eðè\u001eú\u0011ð\u0012\bÌ&\nôÿ\u0012ü\u0004øý\u000fô\u0014ö\u000eðè\u001eú\u0011ð\u0012\bØ\u0012\u0014õÞ(ú\tù\n\u0007\u0000ÿ\u0010Ð-ÿ\u0004\u0000\u0000ø\n\u0007á&øöì\té\t\u0004ó\u0004à*ö\u0013\u0001\rÿÃ3\u0010\u0001\u0004ô\u0007\u000eí\u000e¾;\u0006\u0007ò\u000eýô\fÄ\u0013\u0006\u001cÑ;éò\bÚQ3\u0013\u0001ó\u0010\u0000½5\rÿÃ3\u0010\u0001\u0004ô\u0007\u000eí\u000e¾;\u0006\u0007ò\u000eýô\fÄ\u00063þÕû\u0002\u0007ý\u0001/Ô0Í\bú\n*Ìì\bê\tG\u0002²Gü\f\u0001÷\u0000\u0003\t\t®Mú\u0002\u000f¶ÿ\u0010Ú\u0019\u0000\u0006ù\u0014ö\u0007\u0000á\u0018\u0010\u0004ù\u0004ú\u0006ü$ï\u0014\u0012ð\n\bñà\u001e\u0014î".getBytes("ISO-8859-1"), 0, bArr, 0, 1172);
        $$a = bArr;
        $$b = 206;
        $10 = ($11 + 29) % 128;
    }

    private static void getMediationNetwork(int i10, int i11) {
        $11 = ($10 + 61) % 128;
    }
}
