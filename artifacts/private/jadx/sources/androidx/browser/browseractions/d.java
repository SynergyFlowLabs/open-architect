package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.core.widget.r;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class d implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f11760f = "BrowserActionskMenuUi";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f11761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Uri f11762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<androidx.browser.browseractions.a> f11763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    InterfaceC0039d f11764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private androidx.browser.browseractions.c f11765e;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((ClipboardManager) d.this.f11761a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("url", d.this.f11762b.toString()));
            Toast.makeText(d.this.f11761a, d.this.f11761a.getString(q.a.e.f350228a), 0).show();
        }
    }

    class b implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f11767a;

        b(View view) {
            this.f11767a = view;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            InterfaceC0039d interfaceC0039d = d.this.f11764d;
            if (interfaceC0039d == null) {
                return;
            }
            interfaceC0039d.a(this.f11767a);
        }
    }

    class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f11769a;

        c(TextView textView) {
            this.f11769a = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (r.k(this.f11769a) == Integer.MAX_VALUE) {
                this.f11769a.setMaxLines(1);
                this.f11769a.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                this.f11769a.setMaxLines(Integer.MAX_VALUE);
                this.f11769a.setEllipsize(null);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.browser.browseractions.d$d, reason: collision with other inner class name */
    @l1
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    interface InterfaceC0039d {
        void a(View view);
    }

    d(@NonNull Context context, @NonNull Uri uri, @NonNull List<androidx.browser.browseractions.a> list) {
        this.f11761a = context;
        this.f11762b = uri;
        this.f11763c = b(list);
    }

    private Runnable a() {
        return new a();
    }

    @NonNull
    private List<androidx.browser.browseractions.a> b(List<androidx.browser.browseractions.a> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new androidx.browser.browseractions.a(this.f11761a.getString(q.a.e.f350230c), c()));
        arrayList.add(new androidx.browser.browseractions.a(this.f11761a.getString(q.a.e.f350229b), a()));
        arrayList.add(new androidx.browser.browseractions.a(this.f11761a.getString(q.a.e.f350231d), d()));
        arrayList.addAll(list);
        return arrayList;
    }

    private PendingIntent c() {
        return PendingIntent.getActivity(this.f11761a, 0, new Intent("android.intent.action.VIEW", this.f11762b), 67108864);
    }

    private PendingIntent d() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", this.f11762b.toString());
        intent.setType("text/plain");
        return PendingIntent.getActivity(this.f11761a, 0, intent, 67108864);
    }

    private BrowserActionsFallbackMenuView f(View view) {
        BrowserActionsFallbackMenuView browserActionsFallbackMenuView = (BrowserActionsFallbackMenuView) view.findViewById(q.a.c.f350225e);
        TextView textView = (TextView) view.findViewById(q.a.c.f350221a);
        textView.setText(this.f11762b.toString());
        textView.setOnClickListener(new c(textView));
        ListView listView = (ListView) view.findViewById(q.a.c.f350224d);
        listView.setAdapter((ListAdapter) new androidx.browser.browseractions.b(this.f11763c, this.f11761a));
        listView.setOnItemClickListener(this);
        return browserActionsFallbackMenuView;
    }

    public void e() {
        View viewInflate = LayoutInflater.from(this.f11761a).inflate(q.a.d.f350226a, (ViewGroup) null);
        androidx.browser.browseractions.c cVar = new androidx.browser.browseractions.c(this.f11761a, f(viewInflate));
        this.f11765e = cVar;
        cVar.setContentView(viewInflate);
        if (this.f11764d != null) {
            this.f11765e.setOnShowListener(new b(viewInflate));
        }
        this.f11765e.show();
    }

    @l1
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    void g(@p0 InterfaceC0039d interfaceC0039d) {
        this.f11764d = interfaceC0039d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        androidx.browser.browseractions.a aVar = this.f11763c.get(i10);
        if (aVar.a() != null) {
            try {
                aVar.a().send();
            } catch (PendingIntent.CanceledException unused) {
            }
        } else if (aVar.d() != null) {
            aVar.d().run();
        }
        androidx.browser.browseractions.c cVar = this.f11765e;
        if (cVar == null) {
            return;
        }
        cVar.dismiss();
    }
}
