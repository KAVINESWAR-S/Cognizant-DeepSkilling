package Exercise;

class computer{
    String cpu;
    String Ram;
    String Gpu;

    private computer(ComputerBuilder builder){
        this.cpu=builder.cpu;
        this.Ram=builder.Ram;
        this.Gpu=builder.Gpu;
    }

    public void  display(){
        System.out.println(cpu);
        System.out.println(Ram);
        System.out.println(Gpu);
    }

    static class ComputerBuilder{
        private String cpu;
        private String Ram;
        private String Gpu;
        public ComputerBuilder Setcpu(String cpu){
            this.cpu=cpu;
            return this;
        }
        public ComputerBuilder Setram(String Ram){
            this.Ram=Ram;
            return this;
        }
        public ComputerBuilder Setgpu(String Gpu){
            this.Gpu=Gpu;
            return this;
        }
        public computer Build(){
            return new computer(this);
        }
    }
}



public class BuilderPatternExample {
    public static void main(String[] args){
        computer a = new computer.ComputerBuilder()
                    .Setcpu("Ryzen")
                    .Setgpu("Rtx 5090")
                    .Setram("8 GB")
                    .Build();
        a.display();
    }
}
