package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f47638a = 400;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f47639b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f47640c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f47641d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f47642e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f47643f = 500;

    @w0(21)
    static class a {
        private a() {
        }

        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public static final class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final e[] f47644a;

        public d(@NonNull e[] eVarArr) {
            this.f47644a = eVarArr;
        }

        @NonNull
        public e[] a() {
            return this.f47644a;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final String f47645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f47646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f47647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f47648d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f47649e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f47650f;

        public e(@NonNull String str, int i10, boolean z10, @p0 String str2, int i11, int i12) {
            this.f47645a = str;
            this.f47646b = i10;
            this.f47647c = z10;
            this.f47648d = str2;
            this.f47649e = i11;
            this.f47650f = i12;
        }

        @NonNull
        public String a() {
            return this.f47645a;
        }

        public int b() {
            return this.f47650f;
        }

        public int c() {
            return this.f47649e;
        }

        @p0
        public String d() {
            return this.f47648d;
        }

        public int e() {
            return this.f47646b;
        }

        public boolean f() {
            return this.f47647c;
        }
    }

    private f() {
    }

    private static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    @p0
    public static b b(@NonNull XmlPullParser xmlPullParser, @NonNull Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @NonNull
    public static List<List<byte[]>> c(@NonNull Resources resources, @androidx.annotation.e int i10) {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                List<List<byte[]>> list = Collections.EMPTY_LIST;
                typedArrayObtainTypedArray.recycle();
                return list;
            }
            ArrayList arrayList = new ArrayList();
            int i11 = 7 >> 1;
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i12 = 0; i12 < typedArrayObtainTypedArray.length(); i12++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i12, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            typedArrayObtainTypedArray.recycle();
            return arrayList;
        } catch (Throwable th2) {
            typedArrayObtainTypedArray.recycle();
            throw th2;
        }
    }

    @p0
    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    @p0
    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), i1.a.j.f286851j);
        String string = typedArrayObtainAttributes.getString(i1.a.j.f286852k);
        String string2 = typedArrayObtainAttributes.getString(i1.a.j.f286857p);
        String string3 = typedArrayObtainAttributes.getString(i1.a.j.f286858q);
        String string4 = typedArrayObtainAttributes.getString(i1.a.j.f286854m);
        int resourceId = typedArrayObtainAttributes.getResourceId(i1.a.j.f286853l, 0);
        int integer = typedArrayObtainAttributes.getInteger(i1.a.j.f286855n, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(i1.a.j.f286856o, 500);
        String string5 = typedArrayObtainAttributes.getString(i1.a.j.f286859r);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            List<List<byte[]>> listC = c(resources, resourceId);
            return new C0386f(new androidx.core.provider.f(string, string2, string3, listC), string4 != null ? new androidx.core.provider.f(string, string2, string4, listC) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals(io.ktor.http.m.d.f296017b)) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new d((e[]) arrayList.toArray(new e[0]));
    }

    private static e f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), i1.a.j.f286860s);
        int i10 = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(i1.a.j.B) ? i1.a.j.B : i1.a.j.f286862u, 400);
        boolean z10 = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(i1.a.j.f286867z) ? i1.a.j.f286867z : i1.a.j.f286863v, 0);
        int i11 = typedArrayObtainAttributes.hasValue(i1.a.j.C) ? i1.a.j.C : i1.a.j.f286864w;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(i1.a.j.A) ? i1.a.j.A : i1.a.j.f286865x);
        int i12 = typedArrayObtainAttributes.getInt(i11, 0);
        int i13 = typedArrayObtainAttributes.hasValue(i1.a.j.f286866y) ? i1.a.j.f286866y : i1.a.j.f286861t;
        int resourceId = typedArrayObtainAttributes.getResourceId(i13, 0);
        String string2 = typedArrayObtainAttributes.getString(i13);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new e(string2, i10, z10, string, i12, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: androidx.core.content.res.f$f, reason: collision with other inner class name */
    public static final class C0386f implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final androidx.core.provider.f f47651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private final androidx.core.provider.f f47652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f47653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f47654d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private final String f47655e;

        @b1({b1.a.LIBRARY})
        public C0386f(@NonNull androidx.core.provider.f fVar, @p0 androidx.core.provider.f fVar2, int i10, int i11, @p0 String str) {
            this.f47651a = fVar;
            this.f47652b = fVar2;
            this.f47654d = i10;
            this.f47653c = i11;
            this.f47655e = str;
        }

        @p0
        public androidx.core.provider.f a() {
            return this.f47652b;
        }

        public int b() {
            return this.f47654d;
        }

        @NonNull
        public androidx.core.provider.f c() {
            return this.f47651a;
        }

        @b1({b1.a.LIBRARY})
        @p0
        public String d() {
            return this.f47655e;
        }

        public int e() {
            return this.f47653c;
        }

        public C0386f(@NonNull androidx.core.provider.f fVar, int i10, int i11) {
            this(fVar, null, i10, i11, null);
        }
    }
}
