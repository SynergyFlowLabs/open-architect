package rx.internal.util.unsafe;

/* JADX INFO: loaded from: classes14.dex */
public interface MessagePassingQueue<M> {
    boolean isEmpty();

    boolean offer(M m10);

    M peek();

    M poll();

    int size();
}
