package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l0;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.work.impl.constraints.d;
import androidx.work.impl.constraints.e;
import androidx.work.impl.f;
import androidx.work.impl.model.n;
import androidx.work.impl.model.z;
import androidx.work.impl.r0;
import androidx.work.v;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlinx.coroutines.p2;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public class b implements d, f {
    private static final String X = "ACTION_STOP_FOREGROUND";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f76850k = v.i("SystemFgDispatcher");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f76851l = "KEY_NOTIFICATION";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f76852m = "KEY_NOTIFICATION_ID";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f76853n = "KEY_FOREGROUND_SERVICE_TYPE";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f76854o = "KEY_WORKSPEC_ID";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f76855s = "KEY_GENERATION";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f76856t = "ACTION_START_FOREGROUND";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f76857v = "ACTION_NOTIFY";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f76858w = "ACTION_CANCEL_WORK";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f76859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r0 f76860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.work.impl.utils.taskexecutor.b f76861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f76862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    n f76863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Map<n, androidx.work.n> f76864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map<n, androidx.work.impl.model.v> f76865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map<n, p2> f76866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final e f76867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private InterfaceC0782b f76868j;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f76869a;

        a(final String val$workSpecId) {
            this.f76869a = val$workSpecId;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.work.impl.model.v vVarG = b.this.f76860b.O().g(this.f76869a);
            if (vVarG == null || !vVarG.H()) {
                return;
            }
            synchronized (b.this.f76862d) {
                b.this.f76865g.put(z.a(vVarG), vVarG);
                b bVar = b.this;
                b.this.f76866h.put(z.a(vVarG), androidx.work.impl.constraints.f.b(bVar.f76867i, vVarG, bVar.f76861c.a(), b.this));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.foreground.b$b, reason: collision with other inner class name */
    interface InterfaceC0782b {
        void a(int notificationId, @NonNull Notification notification);

        void c(int notificationId, int notificationType, @NonNull Notification notification);

        void d(int notificationId);

        void stop();
    }

    b(@NonNull Context context) {
        this.f76859a = context;
        this.f76862d = new Object();
        r0 r0VarM = r0.M(context);
        this.f76860b = r0VarM;
        this.f76861c = r0VarM.U();
        this.f76863e = null;
        this.f76864f = new LinkedHashMap();
        this.f76866h = new HashMap();
        this.f76865g = new HashMap();
        this.f76867i = new e(this.f76860b.R());
        this.f76860b.O().e(this);
    }

    @NonNull
    public static Intent c(@NonNull Context context, @NonNull String workSpecId) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(f76858w);
        intent.setData(Uri.parse("workspec://" + workSpecId));
        intent.putExtra(f76854o, workSpecId);
        return intent;
    }

    @NonNull
    public static Intent f(@NonNull Context context, @NonNull n id2, @NonNull androidx.work.n info) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(f76857v);
        intent.putExtra(f76852m, info.c());
        intent.putExtra(f76853n, info.a());
        intent.putExtra(f76851l, info.b());
        intent.putExtra(f76854o, id2.f());
        intent.putExtra(f76855s, id2.e());
        return intent;
    }

    @NonNull
    public static Intent g(@NonNull Context context, @NonNull n id2, @NonNull androidx.work.n info) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(f76856t);
        intent.putExtra(f76854o, id2.f());
        intent.putExtra(f76855s, id2.e());
        intent.putExtra(f76852m, info.c());
        intent.putExtra(f76853n, info.a());
        intent.putExtra(f76851l, info.b());
        return intent;
    }

    @NonNull
    public static Intent h(@NonNull Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(X);
        return intent;
    }

    @l0
    private void i(@NonNull Intent intent) {
        v.e().f(f76850k, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra(f76854o);
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f76860b.h(UUID.fromString(stringExtra));
    }

    @l0
    private void j(@NonNull Intent intent) {
        int iA = 0;
        int intExtra = intent.getIntExtra(f76852m, 0);
        int intExtra2 = intent.getIntExtra(f76853n, 0);
        String stringExtra = intent.getStringExtra(f76854o);
        n nVar = new n(stringExtra, intent.getIntExtra(f76855s, 0));
        Notification notification = (Notification) intent.getParcelableExtra(f76851l);
        v.e().a(f76850k, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification != null && this.f76868j != null) {
            this.f76864f.put(nVar, new androidx.work.n(intExtra, notification, intExtra2));
            if (this.f76863e == null) {
                this.f76863e = nVar;
                this.f76868j.c(intExtra, intExtra2, notification);
                return;
            }
            this.f76868j.a(intExtra, notification);
            if (intExtra2 != 0) {
                Iterator<Map.Entry<n, androidx.work.n>> it = this.f76864f.entrySet().iterator();
                while (it.hasNext()) {
                    iA |= it.next().getValue().a();
                }
                androidx.work.n nVar2 = this.f76864f.get(this.f76863e);
                if (nVar2 != null) {
                    this.f76868j.c(nVar2.c(), iA, nVar2.b());
                }
            }
        }
    }

    @l0
    private void k(@NonNull Intent intent) {
        v.e().f(f76850k, "Started foreground service " + intent);
        this.f76861c.b(new a(intent.getStringExtra(f76854o)));
    }

    @Override // androidx.work.impl.f
    @l0
    public void d(@NonNull n id2, boolean needsReschedule) {
        Map.Entry<n, androidx.work.n> entry;
        synchronized (this.f76862d) {
            try {
                p2 p2VarRemove = this.f76865g.remove(id2) != null ? this.f76866h.remove(id2) : null;
                if (p2VarRemove != null) {
                    p2VarRemove.e(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        androidx.work.n nVarRemove = this.f76864f.remove(id2);
        if (id2.equals(this.f76863e)) {
            if (this.f76864f.size() > 0) {
                Iterator<Map.Entry<n, androidx.work.n>> it = this.f76864f.entrySet().iterator();
                Map.Entry<n, androidx.work.n> next = it.next();
                while (true) {
                    entry = next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f76863e = entry.getKey();
                if (this.f76868j != null) {
                    androidx.work.n value = entry.getValue();
                    this.f76868j.c(value.c(), value.a(), value.b());
                    this.f76868j.d(value.c());
                }
            } else {
                this.f76863e = null;
            }
        }
        InterfaceC0782b interfaceC0782b = this.f76868j;
        if (nVarRemove == null || interfaceC0782b == null) {
            return;
        }
        v.e().a(f76850k, "Removing Notification (id: " + nVarRemove.c() + ", workSpecId: " + id2 + ", notificationType: " + nVarRemove.a());
        interfaceC0782b.d(nVarRemove.c());
    }

    @Override // androidx.work.impl.constraints.d
    public void e(@NonNull androidx.work.impl.model.v workSpec, @NonNull androidx.work.impl.constraints.b state) {
        if (state instanceof androidx.work.impl.constraints.b.C0778b) {
            String str = workSpec.f76983a;
            v.e().a(f76850k, "Constraints unmet for WorkSpec " + str);
            this.f76860b.Z(z.a(workSpec));
        }
    }

    @l0
    void l(@NonNull Intent intent) {
        v.e().f(f76850k, "Stopping foreground service");
        InterfaceC0782b interfaceC0782b = this.f76868j;
        if (interfaceC0782b != null) {
            interfaceC0782b.stop();
        }
    }

    @l0
    void m() {
        this.f76868j = null;
        synchronized (this.f76862d) {
            try {
                Iterator<p2> it = this.f76866h.values().iterator();
                while (it.hasNext()) {
                    it.next().e(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f76860b.O().n(this);
    }

    void n(@NonNull Intent intent) {
        String action = intent.getAction();
        if (f76856t.equals(action)) {
            k(intent);
            j(intent);
        } else if (f76857v.equals(action)) {
            j(intent);
        } else if (f76858w.equals(action)) {
            i(intent);
        } else {
            if (X.equals(action)) {
                l(intent);
            }
        }
    }

    @l0
    void o(@NonNull InterfaceC0782b callback) {
        if (this.f76868j != null) {
            v.e().c(f76850k, "A callback already exists.");
        } else {
            this.f76868j = callback;
        }
    }

    @l1
    b(@NonNull Context context, @NonNull r0 workManagerImpl, @NonNull e tracker) {
        this.f76859a = context;
        this.f76862d = new Object();
        this.f76860b = workManagerImpl;
        this.f76861c = workManagerImpl.U();
        this.f76863e = null;
        this.f76864f = new LinkedHashMap();
        this.f76866h = new HashMap();
        this.f76865g = new HashMap();
        this.f76867i = tracker;
        this.f76860b.O().e(this);
    }
}
