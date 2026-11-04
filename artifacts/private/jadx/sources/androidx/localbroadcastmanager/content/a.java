package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f52668f = "LocalBroadcastManager";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f52669g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f52670h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f52671i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static a f52672j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f52673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f52674b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, ArrayList<c>> f52675c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<b> f52676d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f52677e;

    /* JADX INFO: renamed from: androidx.localbroadcastmanager.content.a$a, reason: collision with other inner class name */
    class HandlerC0489a extends Handler {
        HandlerC0489a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f52679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList<c> f52680b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.f52679a = intent;
            this.f52680b = arrayList;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final IntentFilter f52681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f52682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f52683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f52684d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f52681a = intentFilter;
            this.f52682b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f52682b);
            sb2.append(" filter=");
            sb2.append(this.f52681a);
            if (this.f52684d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    private a(Context context) {
        this.f52673a = context;
        this.f52677e = new HandlerC0489a(context.getMainLooper());
    }

    @NonNull
    public static a b(@NonNull Context context) {
        a aVar;
        synchronized (f52671i) {
            try {
                if (f52672j == null) {
                    f52672j = new a(context.getApplicationContext());
                }
                aVar = f52672j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f52674b) {
                try {
                    size = this.f52676d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f52676d.toArray(bVarArr);
                    this.f52676d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                int size2 = bVar.f52680b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c cVar = bVar.f52680b.get(i11);
                    if (!cVar.f52684d) {
                        cVar.f52682b.onReceive(this.f52673a, bVar.f52679a);
                    }
                }
            }
        }
    }

    public void c(@NonNull BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        synchronized (this.f52674b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList<c> arrayList = this.f52674b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f52674b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                    String action = intentFilter.getAction(i10);
                    ArrayList<c> arrayList2 = this.f52675c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f52675c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean d(@NonNull Intent intent) {
        int iMatch;
        synchronized (this.f52674b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f52673a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z10 = (intent.getFlags() & 8) != 0;
                if (z10) {
                    intent.toString();
                }
                ArrayList<c> arrayList = this.f52675c.get(intent.getAction());
                if (arrayList != null) {
                    if (z10) {
                        arrayList.toString();
                    }
                    ArrayList arrayList2 = null;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        c cVar = arrayList.get(i10);
                        if (z10) {
                            Objects.toString(cVar.f52681a);
                        }
                        if (!cVar.f52683c && (iMatch = cVar.f52681a.match(action, strResolveTypeIfNeeded, scheme, data, categories, f52668f)) >= 0) {
                            if (z10) {
                                Integer.toHexString(iMatch);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(cVar);
                            cVar.f52683c = true;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            ((c) arrayList2.get(i11)).f52683c = false;
                        }
                        this.f52676d.add(new b(intent, arrayList2));
                        if (!this.f52677e.hasMessages(1)) {
                            this.f52677e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(@NonNull Intent intent) {
        if (d(intent)) {
            a();
        }
    }

    public void f(@NonNull BroadcastReceiver broadcastReceiver) {
        synchronized (this.f52674b) {
            try {
                ArrayList<c> arrayListRemove = this.f52674b.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    c cVar = arrayListRemove.get(size);
                    cVar.f52684d = true;
                    for (int i10 = 0; i10 < cVar.f52681a.countActions(); i10++) {
                        String action = cVar.f52681a.getAction(i10);
                        ArrayList<c> arrayList = this.f52675c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = arrayList.get(size2);
                                if (cVar2.f52682b == broadcastReceiver) {
                                    cVar2.f52684d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f52675c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
