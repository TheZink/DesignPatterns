public class Main {
	public static void main(String[] args) {
		// Create files
		File file1 = new File("document.txt", 5);
		File file2 = new File("photo.jpg", 15);
		File file3 = new File("notes.txt", 2);
		File file4 = new File("archive.zip", 20);

		// Create directories
		Directory root = new Directory("root");
		Directory docs = new Directory("docs");
		Directory images = new Directory("images");

		// Build directory structure
		root.AddElement(file1);
		root.AddElement(docs);
		root.AddElement(images);
		docs.AddElement(file3);
		docs.AddElement(file4);
		images.AddElement(file2);

		// Apply SizeCalculatorVisitor
		SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
		root.accept(sizeVisitor);
		System.out.println("Total size: " + sizeVisitor.getTotalSize() + " MB");

		// Apply SearchVisitor for '.txt' files
		SearchVisitor searchVisitor = new SearchVisitor(".txt");
		root.accept(searchVisitor);
		System.out.println("Found .txt files:");
		for (File f : searchVisitor.getFiles()) {
			System.out.println("- " + f.getName() + " (" + f.getSize() + " MB)");
		}
	}
}
