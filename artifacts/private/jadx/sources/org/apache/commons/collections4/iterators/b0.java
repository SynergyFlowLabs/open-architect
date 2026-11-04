package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes14.dex */
public class b0 implements Iterator<Node> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NodeList f335777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f335778b = 0;

    public b0(Node node) {
        if (node == null) {
            throw new NullPointerException("Node must not be null.");
        }
        this.f335777a = node.getChildNodes();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Node next() {
        NodeList nodeList = this.f335777a;
        if (nodeList == null || this.f335778b >= nodeList.getLength()) {
            throw new NoSuchElementException("underlying nodeList has no more elements");
        }
        NodeList nodeList2 = this.f335777a;
        int i10 = this.f335778b;
        this.f335778b = i10 + 1;
        return nodeList2.item(i10);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        NodeList nodeList = this.f335777a;
        return nodeList != null && this.f335778b < nodeList.getLength();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() method not supported for a NodeListIterator.");
    }

    public b0(NodeList nodeList) {
        if (nodeList != null) {
            this.f335777a = nodeList;
            return;
        }
        throw new NullPointerException("NodeList must not be null.");
    }
}
