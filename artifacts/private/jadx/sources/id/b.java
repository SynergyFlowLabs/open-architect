package id;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.f1;
import com.planner5d.library.f;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.services.utility.h3;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f287087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @f1
    private final int f287088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f287089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f287090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f287091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f287092f;

    private b(long j10, @NonNull Map<String, String> map, @f1 int i10, String str, boolean z10, boolean z11) {
        this.f287092f = j10;
        this.f287087a = new HashMap(map);
        this.f287088b = i10;
        this.f287089c = str;
        this.f287090d = z10;
        this.f287091e = z11;
    }

    private String b(Context context, n1 n1Var) {
        int i10 = this.f287088b;
        if (i10 != 0) {
            return context.getString(i10, context.getString(f.s.L1));
        }
        String strA = n1Var.a(context);
        if (!this.f287087a.containsKey(strA)) {
            strA = n1Var.i();
            if (!this.f287087a.containsKey(strA)) {
                if (this.f287087a.isEmpty()) {
                    return null;
                }
                Map<String, String> map = this.f287087a;
                return map.get(map.keySet().iterator().next());
            }
        }
        return this.f287087a.get(strA);
    }

    public static b g(long j10, boolean z10, Map<String, String> map, String str) {
        return new b(j10, map, 0, str, false, z10);
    }

    public static b h(long j10, boolean z10) {
        return new b(j10, new HashMap(), f.s.ju, null, true, z10);
    }

    public static b i(long j10, boolean z10, Map<String, String> map) {
        return new b(j10, map, 0, null, true, z10);
    }

    public CharSequence a(Context context, n1 n1Var) {
        String strB = b(context, n1Var);
        if (strB == null) {
            return null;
        }
        return com.planner5d.library.services.textspan.b.d(strB);
    }

    public Uri c(Context context) {
        if (this.f287090d) {
            return h3.I(context);
        }
        String str = this.f287089c;
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public boolean d() {
        return this.f287091e;
    }

    public boolean e() {
        return this.f287090d || this.f287091e;
    }

    public boolean f() {
        return this.f287090d;
    }
}
