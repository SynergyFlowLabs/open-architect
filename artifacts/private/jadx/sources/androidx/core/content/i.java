package androidx.core.content;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f47501p = "IntentSanitizer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.core.util.z<String> f47503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.core.util.z<Uri> f47504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.core.util.z<String> f47505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.core.util.z<String> f47506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.core.util.z<String> f47507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.core.util.z<ComponentName> f47508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f47509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, androidx.core.util.z<Object>> f47510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f47511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.core.util.z<Uri> f47512k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.core.util.z<ClipData> f47513l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f47514m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f47515n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f47516o;

    @w0(29)
    private static class b {
        private b() {
        }

        static String a(Intent intent) {
            return intent.getIdentifier();
        }

        static Intent b(Intent intent, String str) {
            return intent.setIdentifier(str);
        }
    }

    @w0(31)
    private static class c {
        private c() {
        }

        static void a(int i10, ClipData.Item item, androidx.core.util.e<String> eVar) {
            if (item.getHtmlText() == null && item.getIntent() == null && item.getTextLinks() == null) {
                return;
            }
            eVar.accept("ClipData item at position " + i10 + " contains htmlText, textLinks or intent: " + item);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final int f47517q = 2112614400;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final int f47518r = 2015363072;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f47519a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f47526h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f47527i;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f47532n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f47533o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f47534p;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.core.util.z<String> f47520b = new androidx.core.util.z() { // from class: androidx.core.content.t
            @Override // androidx.core.util.z
            public final boolean test(Object obj) {
                return i.d.p((String) obj);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.core.util.z<Uri> f47521c = new androidx.core.util.z() { // from class: androidx.core.content.u
            @Override // androidx.core.util.z
            public final boolean test(Object obj) {
                return i.d.l((Uri) obj);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.core.util.z<String> f47522d = new androidx.core.util.z() { // from class: androidx.core.content.v
            @Override // androidx.core.util.z
            public final boolean test(Object obj) {
                return i.d.b((String) obj);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.core.util.z<String> f47523e = new androidx.core.util.z() { // from class: androidx.core.content.w
            @Override // androidx.core.util.z
            public final boolean test(Object obj) {
                return i.d.k((String) obj);
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private androidx.core.util.z<String> f47524f = new androidx.core.util.z() { // from class: androidx.core.content.x
            @Override // androidx.core.util.z
            public final boolean test(Object obj) {
                return i.d.f((String) obj);
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private androidx.core.util.z<ComponentName> f47525g = new androidx.core.util.z() { // from class: androidx.core.content.y
            @Override // androidx.core.util.z
            public final boolean test(Object obj) {
                return i.d.a((ComponentName) obj);
            }
        };

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Map<String, androidx.core.util.z<Object>> f47528j = new HashMap();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f47529k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private androidx.core.util.z<Uri> f47530l = new androidx.core.util.z() { // from class: androidx.core.content.z
            @Override // androidx.core.util.z
            public final boolean test(Object obj) {
                return i.d.m((Uri) obj);
            }
        };

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private androidx.core.util.z<ClipData> f47531m = new androidx.core.util.z() { // from class: androidx.core.content.a0
            @Override // androidx.core.util.z
            public final boolean test(Object obj) {
                return i.d.q((ClipData) obj);
            }
        };

        public static /* synthetic */ boolean a(ComponentName componentName) {
            return false;
        }

        public static /* synthetic */ boolean b(String str) {
            return false;
        }

        public static /* synthetic */ boolean e(Class cls, androidx.core.util.z zVar, Object obj) {
            return cls.isInstance(obj) && zVar.test(cls.cast(obj));
        }

        public static /* synthetic */ boolean f(String str) {
            return false;
        }

        public static /* synthetic */ boolean i(Object obj) {
            return false;
        }

        public static /* synthetic */ boolean j(ComponentName componentName) {
            return true;
        }

        public static /* synthetic */ boolean k(String str) {
            return false;
        }

        public static /* synthetic */ boolean l(Uri uri) {
            return false;
        }

        public static /* synthetic */ boolean m(Uri uri) {
            return false;
        }

        public static /* synthetic */ boolean o(Object obj) {
            return true;
        }

        public static /* synthetic */ boolean p(String str) {
            return false;
        }

        public static /* synthetic */ boolean q(ClipData clipData) {
            return false;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d A(@NonNull final ComponentName componentName) {
            androidx.core.util.t.l(componentName);
            Objects.requireNonNull(componentName);
            return B(new androidx.core.util.z() { // from class: androidx.core.content.o
                @Override // androidx.core.util.z
                public final boolean test(Object obj) {
                    return componentName.equals((ComponentName) obj);
                }
            });
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d B(@NonNull androidx.core.util.z<ComponentName> zVar) {
            androidx.core.util.t.l(zVar);
            this.f47527i = true;
            this.f47525g = this.f47525g.h(zVar);
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d C(@NonNull final String str) {
            androidx.core.util.t.l(str);
            return B(new androidx.core.util.z() { // from class: androidx.core.content.l
                @Override // androidx.core.util.z
                public final boolean test(Object obj) {
                    return str.equals(((ComponentName) obj).getPackageName());
                }
            });
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d D(@NonNull androidx.core.util.z<Uri> zVar) {
            androidx.core.util.t.l(zVar);
            this.f47521c = this.f47521c.h(zVar);
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d E(@NonNull final String str) {
            androidx.core.util.t.l(str);
            D(new androidx.core.util.z() { // from class: androidx.core.content.m
                @Override // androidx.core.util.z
                public final boolean test(Object obj) {
                    return str.equals(((Uri) obj).getAuthority());
                }
            });
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d F(@NonNull String str, @NonNull androidx.core.util.z<Object> zVar) {
            androidx.core.util.t.l(str);
            androidx.core.util.t.l(zVar);
            androidx.core.util.z<Object> zVar2 = this.f47528j.get(str);
            if (zVar2 == null) {
                zVar2 = new androidx.core.util.z() { // from class: androidx.core.content.r
                    @Override // androidx.core.util.z
                    public final boolean test(Object obj) {
                        return i.d.i(obj);
                    }
                };
            }
            this.f47528j.put(str, zVar2.h(zVar));
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d G(@NonNull String str, @NonNull Class<?> cls) {
            return H(str, cls, new androidx.core.util.z() { // from class: androidx.core.content.b0
                @Override // androidx.core.util.z
                public final boolean test(Object obj) {
                    return i.d.o(obj);
                }
            });
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public <T> d H(@NonNull String str, @NonNull final Class<T> cls, @NonNull final androidx.core.util.z<T> zVar) {
            androidx.core.util.t.l(str);
            androidx.core.util.t.l(cls);
            androidx.core.util.t.l(zVar);
            return F(str, new androidx.core.util.z() { // from class: androidx.core.content.n
                @Override // androidx.core.util.z
                public final boolean test(Object obj) {
                    return i.d.e(cls, zVar, obj);
                }
            });
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d I(@NonNull androidx.core.util.z<Uri> zVar) {
            H("output", Uri.class, zVar);
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d J(@NonNull final String str) {
            H("output", Uri.class, new androidx.core.util.z() { // from class: androidx.core.content.j
                @Override // androidx.core.util.z
                public final boolean test(Object obj) {
                    return str.equals(((Uri) obj).getAuthority());
                }
            });
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d K(@NonNull androidx.core.util.z<Uri> zVar) {
            H("android.intent.extra.STREAM", Uri.class, zVar);
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d L(@NonNull final String str) {
            androidx.core.util.t.l(str);
            H("android.intent.extra.STREAM", Uri.class, new androidx.core.util.z() { // from class: androidx.core.content.s
                @Override // androidx.core.util.z
                public final boolean test(Object obj) {
                    return str.equals(((Uri) obj).getAuthority());
                }
            });
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d M(int i10) {
            this.f47519a = i10 | this.f47519a;
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d N() {
            this.f47519a |= f47517q;
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d O() {
            this.f47532n = true;
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d P(@NonNull androidx.core.util.z<String> zVar) {
            androidx.core.util.t.l(zVar);
            this.f47524f = this.f47524f.h(zVar);
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d Q(@NonNull String str) {
            androidx.core.util.t.l(str);
            Objects.requireNonNull(str);
            return P(new k(str));
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d R() {
            this.f47519a |= f47518r;
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d S() {
            this.f47533o = true;
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d T() {
            this.f47534p = true;
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d U(@NonNull androidx.core.util.z<String> zVar) {
            androidx.core.util.t.l(zVar);
            this.f47522d = this.f47522d.h(zVar);
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d V(@NonNull String str) {
            androidx.core.util.t.l(str);
            Objects.requireNonNull(str);
            return U(new k(str));
        }

        @NonNull
        public i W() {
            boolean z10 = this.f47526h;
            if ((z10 && this.f47527i) || (!z10 && !this.f47527i)) {
                throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
            }
            i iVar = new i();
            iVar.f47502a = this.f47519a;
            iVar.f47503b = this.f47520b;
            iVar.f47504c = this.f47521c;
            iVar.f47505d = this.f47522d;
            iVar.f47506e = this.f47523e;
            iVar.f47507f = this.f47524f;
            iVar.f47509h = this.f47526h;
            iVar.f47508g = this.f47525g;
            iVar.f47510i = this.f47528j;
            iVar.f47511j = this.f47529k;
            iVar.f47512k = this.f47530l;
            iVar.f47513l = this.f47531m;
            iVar.f47514m = this.f47532n;
            iVar.f47515n = this.f47533o;
            iVar.f47516o = this.f47534p;
            return iVar;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d r(@NonNull androidx.core.util.z<String> zVar) {
            androidx.core.util.t.l(zVar);
            this.f47520b = this.f47520b.h(zVar);
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d s(@NonNull String str) {
            androidx.core.util.t.l(str);
            Objects.requireNonNull(str);
            r(new k(str));
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d t() {
            this.f47526h = true;
            this.f47525g = new androidx.core.util.z() { // from class: androidx.core.content.p
                @Override // androidx.core.util.z
                public final boolean test(Object obj) {
                    return i.d.j((ComponentName) obj);
                }
            };
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d u(@NonNull androidx.core.util.z<String> zVar) {
            androidx.core.util.t.l(zVar);
            this.f47523e = this.f47523e.h(zVar);
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d v(@NonNull String str) {
            androidx.core.util.t.l(str);
            Objects.requireNonNull(str);
            return u(new k(str));
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d w(@NonNull androidx.core.util.z<ClipData> zVar) {
            androidx.core.util.t.l(zVar);
            this.f47531m = this.f47531m.h(zVar);
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d x() {
            this.f47529k = true;
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d y(@NonNull androidx.core.util.z<Uri> zVar) {
            androidx.core.util.t.l(zVar);
            this.f47530l = this.f47530l.h(zVar);
            return this;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public d z(@NonNull final String str) {
            androidx.core.util.t.l(str);
            return y(new androidx.core.util.z() { // from class: androidx.core.content.q
                @Override // androidx.core.util.z
                public final boolean test(Object obj) {
                    return str.equals(((Uri) obj).getAuthority());
                }
            });
        }
    }

    public static /* synthetic */ void a(String str) {
        throw new SecurityException(str);
    }

    public static /* synthetic */ void b(String str) {
    }

    private static void r(int i10, ClipData.Item item, androidx.core.util.e<String> eVar) {
        if (item.getHtmlText() == null && item.getIntent() == null) {
            return;
        }
        eVar.accept("ClipData item at position " + i10 + " contains htmlText, textLinks or intent: " + item);
    }

    private void s(Intent intent, String str, Object obj) {
        if (obj == null) {
            intent.getExtras().putString(str, null);
            return;
        }
        if (obj instanceof Parcelable) {
            intent.putExtra(str, (Parcelable) obj);
            return;
        }
        if (obj instanceof Parcelable[]) {
            intent.putExtra(str, (Parcelable[]) obj);
        } else {
            if (obj instanceof Serializable) {
                intent.putExtra(str, (Serializable) obj);
                return;
            }
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
    static void w(@NonNull Intent intent, Intent intent2, androidx.core.util.z<ClipData> zVar, boolean z10, androidx.core.util.z<Uri> zVar2, androidx.core.util.e<String> eVar) {
        CharSequence text;
        Uri uri;
        ClipData clipData = intent.getClipData();
        if (clipData != null) {
            if (zVar != null && zVar.test(clipData)) {
                intent2.setClipData(clipData);
                return;
            }
            ClipData clipData2 = null;
            for (int i10 = 0; i10 < clipData.getItemCount(); i10++) {
                ClipData.Item itemAt = clipData.getItemAt(i10);
                if (Build.VERSION.SDK_INT >= 31) {
                    c.a(i10, itemAt, eVar);
                } else {
                    r(i10, itemAt, eVar);
                }
                if (z10) {
                    text = itemAt.getText();
                } else {
                    if (itemAt.getText() != null) {
                        eVar.accept("Item text cannot contain value. Item position: " + i10 + ". Text: " + ((Object) itemAt.getText()));
                    }
                    text = null;
                }
                if (zVar2 != null) {
                    if (itemAt.getUri() == null || zVar2.test(itemAt.getUri())) {
                        uri = itemAt.getUri();
                    } else {
                        eVar.accept("Item URI is not allowed. Item position: " + i10 + ". URI: " + itemAt.getUri());
                    }
                    if (text == null || uri != null) {
                        if (clipData2 == null) {
                            clipData2 = new ClipData(clipData.getDescription(), new ClipData.Item(text, null, uri));
                        } else {
                            clipData2.addItem(new ClipData.Item(text, null, uri));
                        }
                    }
                } else if (itemAt.getUri() != null) {
                    eVar.accept("Item URI is not allowed. Item position: " + i10 + ". URI: " + itemAt.getUri());
                }
                uri = null;
                if (text == null) {
                    if (clipData2 == null) {
                        clipData2 = new ClipData(clipData.getDescription(), new ClipData.Item(text, null, uri));
                    } else {
                        clipData2.addItem(new ClipData.Item(text, null, uri));
                    }
                } else if (clipData2 == null) {
                    clipData2 = new ClipData(clipData.getDescription(), new ClipData.Item(text, null, uri));
                } else {
                    clipData2.addItem(new ClipData.Item(text, null, uri));
                }
            }
            if (clipData2 != null) {
                intent2.setClipData(clipData2);
            }
        }
    }

    @NonNull
    public Intent t(@NonNull Intent intent, @NonNull androidx.core.util.e<String> eVar) {
        Intent intent2 = new Intent();
        ComponentName component = intent.getComponent();
        if ((this.f47509h && component == null) || this.f47508g.test(component)) {
            intent2.setComponent(component);
        } else {
            eVar.accept("Component is not allowed: " + component);
            intent2.setComponent(new ComponentName("android", "java.lang.Void"));
        }
        String str = intent.getPackage();
        if (str == null || this.f47507f.test(str)) {
            intent2.setPackage(str);
        } else {
            eVar.accept("Package is not allowed: " + str);
        }
        int flags = this.f47502a | intent.getFlags();
        int i10 = this.f47502a;
        if (flags == i10) {
            intent2.setFlags(intent.getFlags());
        } else {
            intent2.setFlags(intent.getFlags() & i10);
            eVar.accept("The intent contains flags that are not allowed: 0x" + Integer.toHexString(intent.getFlags() & (~this.f47502a)));
        }
        String action = intent.getAction();
        if (action == null || this.f47503b.test(action)) {
            intent2.setAction(action);
        } else {
            eVar.accept("Action is not allowed: " + action);
        }
        Uri data = intent.getData();
        if (data == null || this.f47504c.test(data)) {
            intent2.setData(data);
        } else {
            eVar.accept("Data is not allowed: " + data);
        }
        String type = intent.getType();
        if (type == null || this.f47505d.test(type)) {
            intent2.setDataAndType(intent2.getData(), type);
        } else {
            eVar.accept("Type is not allowed: " + type);
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            for (String str2 : categories) {
                if (this.f47506e.test(str2)) {
                    intent2.addCategory(str2);
                } else {
                    eVar.accept("Category is not allowed: " + str2);
                }
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str3 : extras.keySet()) {
                if (str3.equals("android.intent.extra.STREAM") && (this.f47502a & 1) == 0) {
                    eVar.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                } else if (!str3.equals("output") || ((~this.f47502a) & 3) == 0) {
                    Object obj = extras.get(str3);
                    androidx.core.util.z<Object> zVar = this.f47510i.get(str3);
                    if (zVar == null || !zVar.test(obj)) {
                        eVar.accept("Extra is not allowed. Key: " + str3 + ". Value: " + obj);
                    } else {
                        s(intent2, str3, obj);
                    }
                } else {
                    eVar.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                }
            }
        }
        w(intent, intent2, this.f47513l, this.f47511j, this.f47512k, eVar);
        if (this.f47514m) {
            b.b(intent2, b.a(intent));
        } else if (b.a(intent) != null) {
            eVar.accept("Identifier is not allowed: " + b.a(intent));
        }
        if (this.f47515n) {
            intent2.setSelector(intent.getSelector());
        } else if (intent.getSelector() != null) {
            eVar.accept("Selector is not allowed: " + intent.getSelector());
        }
        if (this.f47516o) {
            intent2.setSourceBounds(intent.getSourceBounds());
            return intent2;
        }
        if (intent.getSourceBounds() != null) {
            eVar.accept("SourceBounds is not allowed: " + intent.getSourceBounds());
        }
        return intent2;
    }

    @NonNull
    public Intent u(@NonNull Intent intent) {
        return t(intent, new androidx.core.util.e() { // from class: androidx.core.content.h
            @Override // androidx.core.util.e
            public final void accept(Object obj) {
                i.b((String) obj);
            }
        });
    }

    @NonNull
    public Intent v(@NonNull Intent intent) {
        return t(intent, new androidx.core.util.e() { // from class: androidx.core.content.g
            @Override // androidx.core.util.e
            public final void accept(Object obj) {
                i.a((String) obj);
            }
        });
    }

    private i() {
    }
}
