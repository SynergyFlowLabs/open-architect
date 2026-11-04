package androidx.browser.browseractions;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.res.i;
import com.google.common.util.concurrent.t1;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class b extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<androidx.browser.browseractions.a> f11746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f11747b;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f11748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f11749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t1 f11750c;

        a(String str, c cVar, t1 t1Var) {
            this.f11748a = str;
            this.f11749b = cVar;
            this.f11750c = t1Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap;
            if (TextUtils.equals(this.f11748a, this.f11749b.f11754b.getText())) {
                try {
                    bitmap = (Bitmap) this.f11750c.get();
                } catch (InterruptedException | ExecutionException unused) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    this.f11749b.f11753a.setVisibility(0);
                    this.f11749b.f11753a.setImageBitmap(bitmap);
                } else {
                    this.f11749b.f11753a.setVisibility(4);
                    this.f11749b.f11753a.setImageBitmap(null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.browser.browseractions.b$b, reason: collision with other inner class name */
    class ExecutorC0038b implements Executor {
        ExecutorC0038b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ImageView f11753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final TextView f11754b;

        c(ImageView imageView, TextView textView) {
            this.f11753a = imageView;
            this.f11754b = textView;
        }
    }

    b(List<androidx.browser.browseractions.a> list, Context context) {
        this.f11746a = list;
        this.f11747b = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f11746a.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f11746a.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        c cVar;
        androidx.browser.browseractions.a aVar = this.f11746a.get(i10);
        if (view == null) {
            view = LayoutInflater.from(this.f11747b).inflate(q.a.d.f350227b, (ViewGroup) null);
            ImageView imageView = (ImageView) view.findViewById(q.a.c.f350222b);
            TextView textView = (TextView) view.findViewById(q.a.c.f350223c);
            if (imageView == null || textView == null) {
                throw new IllegalStateException("Browser Actions fallback UI does not contain necessary Views.");
            }
            cVar = new c(imageView, textView);
            view.setTag(cVar);
        } else {
            cVar = (c) view.getTag();
        }
        String strE = aVar.e();
        cVar.f11754b.setText(strE);
        if (aVar.b() != 0) {
            cVar.f11753a.setImageDrawable(i.g(this.f11747b.getResources(), aVar.b(), null));
            return view;
        }
        if (aVar.c() != null) {
            t1<Bitmap> t1VarK = f.k(this.f11747b.getContentResolver(), aVar.c());
            t1VarK.m0(new a(strE, cVar, t1VarK), new ExecutorC0038b());
            return view;
        }
        cVar.f11753a.setImageBitmap(null);
        cVar.f11753a.setVisibility(4);
        return view;
    }
}
