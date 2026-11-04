package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f380927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatSeekBar f380928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f380929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f380930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f380931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final EditText f380932f;

    private h0(@NonNull View view, @NonNull AppCompatSeekBar appCompatSeekBar, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull EditText editText) {
        this.f380927a = view;
        this.f380928b = appCompatSeekBar;
        this.f380929c = imageView;
        this.f380930d = textView;
        this.f380931e = textView2;
        this.f380932f = editText;
    }

    @NonNull
    public static h0 a(@NonNull View view) {
        int i10 = c1.i.f251770a8;
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) b4.c.a(view, i10);
        if (appCompatSeekBar != null) {
            i10 = c1.i.f251782b8;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = c1.i.f251794c8;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = c1.i.f251806d8;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        i10 = c1.i.f251818e8;
                        EditText editText = (EditText) b4.c.a(view, i10);
                        if (editText != null) {
                            return new h0(view, appCompatSeekBar, imageView, textView, textView2, editText);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static h0 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(c1.l.B2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f380927a;
    }
}
