package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f10710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.appcompat.app.c f10711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f10712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private n.a f10713d;

    public h(g gVar) {
        this.f10710a = gVar;
    }

    public void a() {
        androidx.appcompat.app.c cVar = this.f10711b;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void b(@NonNull g gVar, boolean z10) {
        if (z10 || gVar == this.f10710a) {
            a();
        }
        n.a aVar = this.f10713d;
        if (aVar != null) {
            aVar.b(gVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean c(@NonNull g gVar) {
        n.a aVar = this.f10713d;
        if (aVar != null) {
            return aVar.c(gVar);
        }
        return false;
    }

    public void d(n.a aVar) {
        this.f10713d = aVar;
    }

    public void e(IBinder iBinder) {
        g gVar = this.f10710a;
        androidx.appcompat.app.c.a aVar = new androidx.appcompat.app.c.a(gVar.x());
        e eVar = new e(aVar.getContext(), i.a.j.f286259q);
        this.f10712c = eVar;
        eVar.j(this);
        this.f10710a.b(this.f10712c);
        aVar.setAdapter(this.f10712c.a(), this);
        View viewB = gVar.B();
        if (viewB != null) {
            aVar.setCustomTitle(viewB);
        } else {
            aVar.setIcon(gVar.z()).setTitle(gVar.A());
        }
        aVar.setOnKeyListener(this);
        androidx.appcompat.app.c cVarCreate = aVar.create();
        this.f10711b = cVarCreate;
        cVarCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f10711b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f10711b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f10710a.P((j) this.f10712c.a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f10712c.b(this.f10710a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f10711b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f10711b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f10710a.f(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f10710a.performShortcut(i10, keyEvent, 0);
    }
}
