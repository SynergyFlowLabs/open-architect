package retrofit2;

import java.io.IOException;
import okhttp3.d0;
import okio.e1;

/* JADX INFO: loaded from: classes14.dex */
public interface Call<T> extends Cloneable {
    void cancel();

    Call<T> clone();

    void enqueue(Callback<T> callback);

    Response<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    d0 request();

    e1 timeout();
}
