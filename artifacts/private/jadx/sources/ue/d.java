package ue;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListPopupWindow;
import androidx.annotation.d0;
import com.planner5d.library.widget.c1;
import rx.Observable;
import rx.subjects.PublishSubject;

/* JADX INFO: loaded from: classes12.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ListPopupWindow f381247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f381248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PublishSubject<b> f381249c = PublishSubject.create();

    public d(Context context, b[] bVarArr) {
        ListPopupWindow listPopupWindow = new ListPopupWindow(context);
        this.f381247a = listPopupWindow;
        listPopupWindow.setBackgroundDrawable(androidx.core.content.d.l(context, c1.g.f251410bc));
        a aVar = new a(bVarArr);
        this.f381248b = aVar;
        listPopupWindow.setAdapter(aVar);
        listPopupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: ue.c
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                this.f381246a.b(adapterView, view, i10, j10);
            }
        });
        listPopupWindow.setContentWidth(context.getResources().getDimensionPixelSize(c1.f.I2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AdapterView adapterView, View view, int i10, long j10) {
        b item = this.f381248b.getItem(i10);
        if (item != b.f381244b) {
            this.f381249c.onNext(item);
            this.f381249c.onCompleted();
            this.f381247a.dismiss();
        }
    }

    public d c(int i10) {
        return d(String.valueOf(i10));
    }

    public d d(String str) {
        this.f381248b.b(str);
        this.f381248b.notifyDataSetChanged();
        return this;
    }

    public Observable<b> e(Activity activity, @d0 int i10) {
        return f(activity == null ? null : activity.findViewById(i10));
    }

    public Observable<b> f(View view) {
        if (view == null) {
            return Observable.empty();
        }
        this.f381247a.setAnchorView(view);
        this.f381247a.show();
        return this.f381249c;
    }
}
