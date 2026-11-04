package h7;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.n;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.b;

/* JADX INFO: loaded from: classes4.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f280377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ReviewInfo f280378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f280379c = 0;

    public a(Context context) {
        this.f280377a = context;
    }

    @Override // com.google.android.play.core.review.b
    @NonNull
    public Task<ReviewInfo> a() {
        ReviewInfo reviewInfoC = ReviewInfo.c(PendingIntent.getBroadcast(this.f280377a, 0, new Intent(), 67108864), false);
        this.f280378b = reviewInfoC;
        return n.g(reviewInfoC);
    }

    @Override // com.google.android.play.core.review.b
    @NonNull
    public Task<Void> b(@NonNull Activity activity, @NonNull ReviewInfo reviewInfo) {
        if (reviewInfo != this.f280378b) {
            return n.f(new com.google.android.play.core.review.a(-2));
        }
        this.f280379c++;
        return n.g(null);
    }
}
