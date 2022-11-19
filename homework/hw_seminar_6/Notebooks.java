public class Notebooks {
    String model;
    Double diagonal;
    String typeMatrix;
    Double processorGigaGz;
    String typeProcessor;
    Integer capacityHardDrive;
    String typeHardDrive;
    Integer capacityRam;
    String typeRam;
    Integer capacityVideoCard;
    String typeVideoCard;
    String color;
    Integer price;

    public Notebooks(String model, Double diagonal, String typeMatrix, Double processorGigaGz, String typeProcessor,
        Integer capacityHardDrive, String typeHardDrive, Integer capacityRam, String typeRam, Integer capacityVideoCard, String typeVideoCard, String color, Integer price) {
        this.model = model;
        this.diagonal = diagonal;
        this.typeMatrix = typeMatrix;
        this.processorGigaGz = processorGigaGz;
        this.typeProcessor = typeProcessor;
        this.capacityHardDrive = capacityHardDrive;
        this.typeHardDrive = typeHardDrive;
        this.capacityRam = capacityRam;
        this.typeRam = typeRam;
        this.capacityVideoCard = capacityVideoCard;
        this.typeVideoCard = typeVideoCard;
        this.color = color;
        this.price = price;
        }
    
        @Override
        public String toString() {
            return String.format("%s, %.1f, %s, %.1f, %s, %d, %s, %d, %s, %d, %s, %s, %d", model, diagonal, typeMatrix, processorGigaGz, typeProcessor,
            capacityHardDrive, typeHardDrive, capacityRam, typeRam, capacityVideoCard, typeVideoCard, color, price);
        }
}
