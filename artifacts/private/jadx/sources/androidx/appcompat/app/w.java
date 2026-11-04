package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
class w implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.e f10386a;

    public w(a.e eVar) {
        this.f10386a = eVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        a.e eVar = this.f10386a;
        if (eVar != null) {
            eVar.onNavigationItemSelected(i10, j10);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
