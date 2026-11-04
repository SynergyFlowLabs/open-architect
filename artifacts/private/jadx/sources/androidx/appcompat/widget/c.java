package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes.dex */
class c extends DataSetObservable {
    private static final Object A = new Object();
    private static final Map<String, c> B = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final boolean f11169n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final String f11170o = "c";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final String f11171p = "historical-records";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final String f11172q = "historical-record";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final String f11173r = "activity";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final String f11174s = "time";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final String f11175t = "weight";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f11176u = "activity_choser_model_history.xml";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f11177v = 50;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f11178w = 5;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final float f11179x = 1.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f11180y = ".xml";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f11181z = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Context f11185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final String f11186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Intent f11187f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private f f11194m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f11182a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<b> f11183b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<e> f11184c = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC0035c f11188g = new d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11189h = 50;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f11190i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f11191j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f11192k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f11193l = false;

    public interface a {
        void setActivityChooserModel(c cVar);
    }

    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ResolveInfo f11195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f11196b;

        public b(ResolveInfo resolveInfo) {
            this.f11195a = resolveInfo;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Float.floatToIntBits(bVar.f11196b) - Float.floatToIntBits(this.f11196b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && b.class == obj.getClass() && Float.floatToIntBits(this.f11196b) == Float.floatToIntBits(((b) obj).f11196b);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f11196b) + 31;
        }

        public String toString() {
            return "[resolveInfo:" + this.f11195a.toString() + "; weight:" + new BigDecimal(this.f11196b) + "]";
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    public interface InterfaceC0035c {
        void a(Intent intent, List<b> list, List<e> list2);
    }

    private static final class d implements InterfaceC0035c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final float f11197b = 0.95f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<ComponentName, b> f11198a = new HashMap();

        d() {
        }

        @Override // androidx.appcompat.widget.c.InterfaceC0035c
        public void a(Intent intent, List<b> list, List<e> list2) {
            Map<ComponentName, b> map = this.f11198a;
            map.clear();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = list.get(i10);
                bVar.f11196b = 0.0f;
                ActivityInfo activityInfo = bVar.f11195a.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), bVar);
            }
            float f10 = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                e eVar = list2.get(size2);
                b bVar2 = map.get(eVar.f11199a);
                if (bVar2 != null) {
                    bVar2.f11196b += eVar.f11201c * f10;
                    f10 *= f11197b;
                }
            }
            Collections.sort(list);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f11199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f11200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f11201c;

        public e(String str, long j10, float f10) {
            this(ComponentName.unflattenFromString(str), j10, f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                ComponentName componentName = this.f11199a;
                if (componentName == null) {
                    if (eVar.f11199a != null) {
                        return false;
                    }
                } else if (!componentName.equals(eVar.f11199a)) {
                    return false;
                }
                return this.f11200b == eVar.f11200b && Float.floatToIntBits(this.f11201c) == Float.floatToIntBits(eVar.f11201c);
            }
            return false;
        }

        public int hashCode() {
            ComponentName componentName = this.f11199a;
            int iHashCode = componentName == null ? 0 : componentName.hashCode();
            long j10 = this.f11200b;
            return ((((iHashCode + 31) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Float.floatToIntBits(this.f11201c);
        }

        public String toString() {
            return "[; activity:" + this.f11199a + "; time:" + this.f11200b + "; weight:" + new BigDecimal(this.f11201c) + "]";
        }

        public e(ComponentName componentName, long j10, float f10) {
            this.f11199a = componentName;
            this.f11200b = j10;
            this.f11201c = f10;
        }
    }

    public interface f {
        boolean a(c cVar, Intent intent);
    }

    private final class g extends AsyncTask<Object, Void, Void> {
        g() {
        }

        /* JADX WARN: Code duplicated, block: B:38:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Object... objArr) {
            List list = (List) objArr[0];
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = c.this.f11185d.openFileOutput((String) objArr[1], 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        try {
                            xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                            xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                            xmlSerializerNewSerializer.startTag(null, c.f11171p);
                            int size = list.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                e eVar = (e) list.remove(0);
                                xmlSerializerNewSerializer.startTag(null, c.f11172q);
                                xmlSerializerNewSerializer.attribute(null, c.f11173r, eVar.f11199a.flattenToString());
                                xmlSerializerNewSerializer.attribute(null, c.f11174s, String.valueOf(eVar.f11200b));
                                xmlSerializerNewSerializer.attribute(null, c.f11175t, String.valueOf(eVar.f11201c));
                                xmlSerializerNewSerializer.endTag(null, c.f11172q);
                            }
                            xmlSerializerNewSerializer.endTag(null, c.f11171p);
                            xmlSerializerNewSerializer.endDocument();
                            c.this.f11190i = true;
                            if (fileOutputStreamOpenFileOutput != null) {
                                try {
                                    fileOutputStreamOpenFileOutput.close();
                                } catch (IOException unused) {
                                }
                            }
                        } catch (IllegalArgumentException unused2) {
                            String str = c.f11170o;
                            String str2 = c.this.f11186e;
                            c.this.f11190i = true;
                            if (fileOutputStreamOpenFileOutput != null) {
                                fileOutputStreamOpenFileOutput.close();
                            }
                        }
                    } catch (IOException unused3) {
                        String str3 = c.f11170o;
                        String str4 = c.this.f11186e;
                        c.this.f11190i = true;
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                    } catch (IllegalStateException unused4) {
                        String str5 = c.f11170o;
                        String str6 = c.this.f11186e;
                        c.this.f11190i = true;
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    c.this.f11190i = true;
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused5) {
                        }
                    }
                    throw th2;
                }
            } catch (FileNotFoundException unused6) {
                String str7 = c.f11170o;
                return null;
            }
        }
    }

    private c(Context context, String str) {
        this.f11185d = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(f11180y)) {
            this.f11186e = str;
            return;
        }
        this.f11186e = str + f11180y;
    }

    private boolean a(e eVar) {
        boolean zAdd = this.f11184c.add(eVar);
        if (zAdd) {
            this.f11192k = true;
            n();
            m();
            v();
            notifyChanged();
        }
        return zAdd;
    }

    private void c() {
        boolean zL = l() | o();
        n();
        if (zL) {
            v();
            notifyChanged();
        }
    }

    public static c d(Context context, String str) {
        c cVar;
        synchronized (A) {
            try {
                Map<String, c> map = B;
                cVar = map.get(str);
                if (cVar == null) {
                    cVar = new c(context, str);
                    map.put(str, cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    private boolean l() {
        if (!this.f11193l || this.f11187f == null) {
            return false;
        }
        this.f11193l = false;
        this.f11183b.clear();
        List<ResolveInfo> listQueryIntentActivities = this.f11185d.getPackageManager().queryIntentActivities(this.f11187f, 0);
        int size = listQueryIntentActivities.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f11183b.add(new b(listQueryIntentActivities.get(i10)));
        }
        return true;
    }

    private void m() {
        if (!this.f11191j) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.f11192k) {
            this.f11192k = false;
            if (!TextUtils.isEmpty(this.f11186e)) {
                new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f11184c), this.f11186e);
            }
        }
    }

    private void n() {
        int size = this.f11184c.size() - this.f11189h;
        if (size <= 0) {
            return;
        }
        this.f11192k = true;
        for (int i10 = 0; i10 < size; i10++) {
            this.f11184c.remove(0);
        }
    }

    private boolean o() throws IOException {
        if (!this.f11190i || !this.f11192k || TextUtils.isEmpty(this.f11186e)) {
            return false;
        }
        this.f11190i = false;
        this.f11191j = true;
        p();
        return true;
    }

    private void p() throws IOException {
        try {
            FileInputStream fileInputStreamOpenFileInput = this.f11185d.openFileInput(this.f11186e);
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                for (int next = 0; next != 1 && next != 2; next = xmlPullParserNewPullParser.next()) {
                }
                if (!f11171p.equals(xmlPullParserNewPullParser.getName())) {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
                List<e> list = this.f11184c;
                list.clear();
                while (true) {
                    int next2 = xmlPullParserNewPullParser.next();
                    if (next2 == 1) {
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                            return;
                        }
                        return;
                    } else if (next2 != 3 && next2 != 4) {
                        if (!f11172q.equals(xmlPullParserNewPullParser.getName())) {
                            throw new XmlPullParserException("Share records file not well-formed.");
                        }
                        list.add(new e(xmlPullParserNewPullParser.getAttributeValue(null, f11173r), Long.parseLong(xmlPullParserNewPullParser.getAttributeValue(null, f11174s)), Float.parseFloat(xmlPullParserNewPullParser.getAttributeValue(null, f11175t))));
                    }
                }
            } catch (IOException unused) {
                if (fileInputStreamOpenFileInput == null) {
                    return;
                }
                fileInputStreamOpenFileInput.close();
            } catch (XmlPullParserException unused2) {
                if (fileInputStreamOpenFileInput != null) {
                    fileInputStreamOpenFileInput.close();
                }
            } catch (Throwable th2) {
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th2;
            }
        } catch (FileNotFoundException | IOException unused4) {
        }
    }

    private boolean v() {
        if (this.f11188g == null || this.f11187f == null || this.f11183b.isEmpty() || this.f11184c.isEmpty()) {
            return false;
        }
        this.f11188g.a(this.f11187f, this.f11183b, Collections.unmodifiableList(this.f11184c));
        return true;
    }

    public Intent b(int i10) {
        synchronized (this.f11182a) {
            try {
                if (this.f11187f == null) {
                    return null;
                }
                c();
                ActivityInfo activityInfo = this.f11183b.get(i10).f11195a.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                Intent intent = new Intent(this.f11187f);
                intent.setComponent(componentName);
                if (this.f11194m != null) {
                    if (this.f11194m.a(this, new Intent(intent))) {
                        return null;
                    }
                }
                a(new e(componentName, System.currentTimeMillis(), 1.0f));
                return intent;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ResolveInfo e(int i10) {
        ResolveInfo resolveInfo;
        synchronized (this.f11182a) {
            try {
                c();
                resolveInfo = this.f11183b.get(i10).f11195a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return resolveInfo;
    }

    public int f() {
        int size;
        synchronized (this.f11182a) {
            try {
                c();
                size = this.f11183b.size();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return size;
    }

    public int g(ResolveInfo resolveInfo) {
        synchronized (this.f11182a) {
            try {
                c();
                List<b> list = this.f11183b;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (list.get(i10).f11195a == resolveInfo) {
                        return i10;
                    }
                }
                return -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ResolveInfo h() {
        synchronized (this.f11182a) {
            try {
                c();
                if (this.f11183b.isEmpty()) {
                    return null;
                }
                return this.f11183b.get(0).f11195a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int i() {
        int i10;
        synchronized (this.f11182a) {
            try {
                i10 = this.f11189h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public int j() {
        int size;
        synchronized (this.f11182a) {
            c();
            size = this.f11184c.size();
        }
        return size;
    }

    public Intent k() {
        Intent intent;
        synchronized (this.f11182a) {
            intent = this.f11187f;
        }
        return intent;
    }

    public void q(InterfaceC0035c interfaceC0035c) {
        synchronized (this.f11182a) {
            try {
                if (this.f11188g == interfaceC0035c) {
                    return;
                }
                this.f11188g = interfaceC0035c;
                if (v()) {
                    notifyChanged();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void r(int i10) {
        synchronized (this.f11182a) {
            try {
                c();
                b bVar = this.f11183b.get(i10);
                b bVar2 = this.f11183b.get(0);
                float f10 = bVar2 != null ? (bVar2.f11196b - bVar.f11196b) + 5.0f : 1.0f;
                ActivityInfo activityInfo = bVar.f11195a.activityInfo;
                a(new e(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void s(int i10) {
        synchronized (this.f11182a) {
            try {
                if (this.f11189h == i10) {
                    return;
                }
                this.f11189h = i10;
                n();
                if (v()) {
                    notifyChanged();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void t(Intent intent) {
        synchronized (this.f11182a) {
            try {
                if (this.f11187f == intent) {
                    return;
                }
                this.f11187f = intent;
                this.f11193l = true;
                c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void u(f fVar) {
        synchronized (this.f11182a) {
            this.f11194m = fVar;
        }
    }
}
