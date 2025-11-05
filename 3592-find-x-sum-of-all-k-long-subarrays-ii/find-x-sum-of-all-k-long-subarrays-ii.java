class Solution {
    static class Element{
        int value;
        int freq;
        Element(int value,int freq){
            this.value=value;
            this.freq=freq;
        }
        @Override
        public boolean equals(Object obj){
            if(this==obj)return true;
            Element other=(Element)obj;
            return this.value==other.value && this.freq==other.freq;
        }
        @Override
        public int hashCode(){
            return Objects.hash(value,freq);
        }
    }
    public long[] findXSum(int[] nums, int k, int x) {
        int n=nums.length;
        if(n<k)return new long[0];
        long ans[]=new long[n-k+1];
        Map<Integer,Integer>map=new HashMap<>();
        TreeSet<Element>elite=new TreeSet<>((a, b) -> {
    if (a.freq != b.freq) return b.freq - a.freq;
    return b.value - a.value;
});
        TreeSet<Element>other=new TreeSet<>((a, b) -> {
    if (a.freq != b.freq) return b.freq - a.freq;
    return b.value - a.value;
});
        long xsum=0;
        int idx=0;
        for(int i=0;i<n;i++){
            int prevfreq=map.getOrDefault(nums[i],0);
            if(prevfreq>0){
                Element old=new Element(nums[i],prevfreq);
                if(elite.contains(old)){
                    xsum-=(long)old.value*old.freq;
                    elite.remove(old);
                }else{
                    other.remove(old);
                }
            }
            int newFreq=prevfreq+1;
            map.put(nums[i],newFreq);
            Element newElem=new Element(nums[i],newFreq);
            elite.add(newElem);
            xsum+=(long)newElem.value*newElem.freq;
            if(elite.size()>x){
                Element last=elite.last();
                xsum-=(long)last.value*last.freq;
                elite.remove(last);
                other.add(last);
            }
            if(i>=k){
                int out=nums[i-k];
                int freqout=map.get(out);
                Element outElem=new Element(out,freqout);
                if(elite.contains(outElem)){
                    xsum-=(long)outElem.value*outElem.freq;
                    elite.remove(outElem);
                }else{
                    other.remove(outElem);
                }
                if(freqout==1){
                    map.remove(out);
                }else{
                    map.put(out,freqout-1);
                    other.add(new Element(out,freqout-1));
                }
                while(elite.size()<x && !other.isEmpty()){
                    Element pro=other.first();
                    other.remove(pro);
                    elite.add(pro);
                    xsum+=(long)pro.value*pro.freq;
                }
            }
            if(i>=k-1){
                ans[idx++]=xsum;
            }
           
        }return ans;
    }
}