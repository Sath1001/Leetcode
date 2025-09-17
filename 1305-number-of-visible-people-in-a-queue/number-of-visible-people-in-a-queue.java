class Solution {
    public int[] canSeePersonsCount(int[] h) {
        int n= h.length;
        int [] st=new int[n];
        int top=-1;
        st[++top]=h[n-1];
h[n-1]=0;
for(int i=n-2;i>=0;--i)
{
    int c=0;
    while(top>=0 && h[i]>st[top])
    {
        --top;
        ++c;
    }
    if(top>=0) ++c;
    st[++top]=h[i];
    h[i]=c;
}
return h;
}
}
 